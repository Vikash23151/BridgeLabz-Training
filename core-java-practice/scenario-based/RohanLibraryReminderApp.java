import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
public class RohanLibraryReminderApp {
    static int calculateFine(LocalDate returnDate, LocalDate dueDate){
        int dayDifference=(int) ChronoUnit.DAYS.between(dueDate,returnDate);
        int fine=dayDifference*5;
        return fine;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.print("Enter return date (yyyy-mm-dd): ");
            LocalDate returnDate=LocalDate.parse(sc.nextLine().trim());
            System.out.print("Enter due date (yyyy-mm-dd): ");
            LocalDate dueDate=LocalDate.parse(sc.nextLine().trim());
            if(returnDate.isBefore(dueDate) || returnDate.isEqual(dueDate)){
                System.out.println("Returned on time. No fine.");
            }else{
                int fine=calculateFine(returnDate,dueDate);
                System.out.println("The fine is: "+fine+" rupees\n");
            }
        }
    }
}
