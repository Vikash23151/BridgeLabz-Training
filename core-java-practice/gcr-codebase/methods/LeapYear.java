import java.util.Scanner;

public class LeapYear {
    static boolean findLeapYearOrNot(int year){
        return (year%4==0)&&((year%100!=0)||(year%400==0));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        if(!(year>=1582)){
            System.out.println("Enter a year greater than or equal to 1582");
            return;
        }
        boolean isLeapYear=findLeapYearOrNot(year);
        if(isLeapYear){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is a not leap year");
        }
    }
}
