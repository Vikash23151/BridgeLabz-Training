import java.util.Scanner;

public class MovieTicketBookingApp {
    private static final int PLATINUM_PRICE=220;
    private static final int GOLD_PRICE=200;
    private static final int SILVER_PRICE=180;
    private static final int POPCORN_PRICE=100;
    private static final int CHIPS_PRICE=40;
    static int billCalculation(String[] userDetails){
        String seat=userDetails[1];
        String snack=userDetails[2];
        int ticket=Integer.parseInt(userDetails[3]);
        int bill=0;
        switch(seat){
            case "platinum":
                bill+=PLATINUM_PRICE*ticket;
                if(snack.equals("popcorn")){
                    bill+=POPCORN_PRICE;
                }else if(snack.equals("chips")){
                    bill+=CHIPS_PRICE;
                }
            case "gold":
                bill+=GOLD_PRICE*ticket;
                if(snack.equals("popcorn")){
                    bill+=POPCORN_PRICE;
                }else if(snack.equals("chips")){
                    bill+=CHIPS_PRICE;
                }
            case "silver":
                bill+=SILVER_PRICE*ticket;
                if(snack.equals("popcorn")){
                    bill+=POPCORN_PRICE;
                }else if(snack.equals("chips")){
                    bill+=CHIPS_PRICE;
                }
        }
        return bill;
    }
    static void printBill(String[] userDetails, int totalBill){
        System.out.println("-----Bill-----");
        System.out.println("Movie type: "+userDetails[0]);
        System.out.println("Seat type: "+userDetails[1]);
        System.out.println("Number of tickets: "+userDetails[3]);
        System.out.println("Snacks: "+userDetails[2]);
        System.out.println("Total Bill: "+totalBill);
        System.out.println("--------------\n");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            String[] userDetails=new String[4];

            System.out.println("Enter 'cancel' to exit");
            System.out.println("Enter movie type: drama, comedy, romance, thriller, action");
            userDetails[0]=sc.next().toLowerCase();

            if(userDetails[0].equals("cancel")) break;

            System.out.println("Enter seat type: platinum, gold, silver");
            userDetails[1]=sc.next().toLowerCase();

            System.out.println("Enter the snacks: popcorn, chips, none");
            userDetails[2]=sc.next().toLowerCase();

            System.out.println("Enter number of tickets: ");
            userDetails[3]=sc.next();

            int totalBill=billCalculation(userDetails);
            printBill(userDetails,totalBill);
        }
    }
}
