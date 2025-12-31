public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int dailyRate;

    CarRental(String customerName,String carModel, int rentalDays,int dailyRate){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.dailyRate=dailyRate;
    }
    CarRental(CarRental previousCustomer){
        this.customerName=previousCustomer.customerName;
        this.carModel=previousCustomer.carModel;
        this.rentalDays=previousCustomer.rentalDays;
        this.dailyRate=previousCustomer.dailyRate;
    }
    void calculateDisplayTotalCost(){
        int cost=rentalDays*dailyRate;
        System.out.println("Total cost: "+cost);
    }
    void displayDetails(){
        System.out.println("Customer name: "+customerName);
        System.out.println("Car model: "+carModel);
        System.out.println("Rental days: "+rentalDays);
        System.out.println("Daily rates: "+dailyRate);
    }

    public static void main(String[] args) {
        CarRental car=new CarRental("Ryuga","BMW M5",30,5000);
        car.displayDetails();
        car.calculateDisplayTotalCost();
    }

}
