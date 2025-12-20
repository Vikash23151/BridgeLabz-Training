import java.util.Scanner;

public class TheCoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String coffeeType;
        double totalBill=0;
        int quantity;
        double gst=0;
        double price=0;
        while(true){
            // input coffee type
            coffeeType=sc.nextLine();
            if(coffeeType.equals("exit")){
                break;
            }
            quantity=sc.nextInt();
            sc.nextLine();
            switch(coffeeType.toLowerCase()){
                case "espresso":
                    price=120;
                    break;
                case "cappuccino":
                    price=130;
                    break;
                case "latte":
                    price=125;
                    break;
                default:
                    System.out.println("select correct type of coffee");
                    continue;
            }
            double bill=price*quantity;
            gst=bill*0.15;
            totalBill+=bill+gst;
            System.out.println("Bill of "+quantity+" "+coffeeType+" : INR "+(bill+gst));
        }
        System.out.println("Total Bill: INR "+totalBill);
    }
}
