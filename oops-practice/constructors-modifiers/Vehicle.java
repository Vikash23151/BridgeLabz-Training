public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static int registrationFee=1000;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    void displayVehicleDetails(){
        System.out.println("Owner name: "+ownerName);
        System.out.println("Vehicle type: "+vehicleType);
    }

    static void updateRegistrationFee(int updatedFee){
        registrationFee=updatedFee;
    }

    public static void main(String[] args) {
        Vehicle course=new Vehicle("Ryuga","Light");
        course.displayVehicleDetails();
        System.out.println("Registration Fee: "+registrationFee);
        updateRegistrationFee(1500);
        System.out.println("Updated Registration Fee: "+registrationFee);
    }
}
