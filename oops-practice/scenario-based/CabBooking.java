import java.util.ArrayList;
import java.util.List;

// user class
class User {
    private final String userName;
    private final String userID;

    User(String userName, String userID) {
        this.userName = userName;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }
}
// driver class
class Driver {
    private final String driverName;
    private final String driverID;
    private boolean isAvailable = true;

    Driver(String driverName, String driverID) {
        this.driverName = driverName;
        this.driverID = driverID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookDriver() {
        isAvailable = false;
    }

    public void freeDriver() {
        isAvailable = true;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverID() {
        return driverID;
    }
}
// ride status
enum RideStatus {
    BOOKED, COMPLETED, CANCELLED
}
//ride class
class Ride {
    private final String rideId;
    private final User user;
    private Driver driver;
    private final double distanceKm;
    private RideStatus status = RideStatus.BOOKED;
    private double fare;

    Ride(String rideId, User user, double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be > 0");
        }
        this.rideId = rideId;
        this.user = user;
        this.distanceKm = distanceKm;
    }

    public String getRideId() { return rideId; }
    public User getUser() { return user; }
    public Driver getDriver() { return driver; }
    public double getDistanceKm() { return distanceKm; }
    public RideStatus getStatus() { return status; }
    public double getFare() { return fare; }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void complete() {
        this.status = RideStatus.COMPLETED;
    }

    public void cancel() {
        this.status = RideStatus.CANCELLED;
    }
}

//Pricing (Interface + Polymorphism)
interface FareCalculator {
    double calculateFare(double distanceKm);
}

class NormalFareCalculator implements FareCalculator {
    private final double baseFare;
    private final double perKmRate;

    NormalFareCalculator(double baseFare, double perKmRate) {
        this.baseFare = baseFare;
        this.perKmRate = perKmRate;
    }

    @Override
    public double calculateFare(double distanceKm) {
        return baseFare + (perKmRate * distanceKm);
    }
}

class PeakFareCalculator implements FareCalculator {
    private final FareCalculator delegate;
    private final double multiplier; // e.g., 1.5x during peak

    PeakFareCalculator(FareCalculator delegate, double multiplier) {
        this.delegate = delegate;
        this.multiplier = multiplier;
    }

    @Override
    public double calculateFare(double distanceKm) {
        return delegate.calculateFare(distanceKm) * multiplier;
    }
}

//Custom Exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

//Service-Manager(CRUD operations)
class RideService {
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Ride> rideHistory = new ArrayList<>();
    private int rideCounter = 1;

    public void addDriver(Driver driver) { // Create
        drivers.add(driver);
    }

    public List<Ride> getRideHistory() { // Read
        return new ArrayList<>(rideHistory);
    }

    public Ride bookRide(User user, double distanceKm, FareCalculator fareCalculator)
            throws NoDriverAvailableException { // Create
        Driver assigned = assignAvailableDriver(); // may throw

        String rideId = "R" + rideCounter++;
        Ride ride = new Ride(rideId, user, distanceKm);
        ride.assignDriver(assigned);
        ride.setFare(fareCalculator.calculateFare(distanceKm));

        rideHistory.add(ride);
        return ride;
    }

    public void completeRide(String rideId) { // Update
        Ride ride = findRideById(rideId);
        if (ride == null) return;

        if (ride.getStatus() == RideStatus.BOOKED) {
            ride.complete();
            if (ride.getDriver() != null) ride.getDriver().freeDriver();
        }
    }

    public void cancelRide(String rideId) { // Delete (status change)
        Ride ride = findRideById(rideId);
        if (ride == null) return;

        if (ride.getStatus() == RideStatus.BOOKED) {
            ride.cancel();
            if (ride.getDriver() != null) ride.getDriver().freeDriver();
        }
    }

    private Driver assignAvailableDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.bookDriver();
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver available right now.");
    }

    private Ride findRideById(String rideId) {
        for (Ride r : rideHistory) {
            if (r.getRideId().equals(rideId)) return r;
        }
        return null;
    }
}

public class CabBooking {
    public static void main(String[] args) {
        // Setup
        User u1 = new User("Ryuga", "U101");

        Driver d1 = new Driver("Gojo", "D201");
        Driver d2 = new Driver("Toji", "D202");

        RideService service = new RideService();
        service.addDriver(d1);
        service.addDriver(d2);

        FareCalculator normal = new NormalFareCalculator(50, 12);     // base + perKm
        FareCalculator peak = new PeakFareCalculator(normal, 1.5);        // 1.5x

        try {
            // Book rides
            Ride r1 = service.bookRide(u1, 10, normal);
            System.out.println("Booked " + r1.getRideId() + " | Driver: " + r1.getDriver().getDriverName()
                    + " | Fare: " + r1.getFare());

            Ride r2 = service.bookRide(u1, 8, peak);
            System.out.println("Booked " + r2.getRideId() + " | Driver: " + r2.getDriver().getDriverName()
                    + " | Fare: " + r2.getFare());

            // This one will fail if only 2 drivers exist and both are booked
            Ride r3 = service.bookRide(u1, 5, normal);
            System.out.println("Booked " + r3.getRideId());

        } catch (NoDriverAvailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }

        // Complete one ride, then driver becomes free
        service.completeRide("R1");

        // Print ride history
        System.out.println("\nRide history:");
        for (Ride r : service.getRideHistory()) {
            String driverName = (r.getDriver() == null) ? "NA" : r.getDriver().getDriverName();
            System.out.println(r.getRideId() + " | " + r.getUser().getUserName()
                    + " | Driver: " + driverName
                    + " | " + r.getStatus()
                    + " | Fare: " + r.getFare());
        }
    }
}
