import java.util.Scanner;

public class SpringSeasonMethod {
    static boolean isSpringSeason(String month, int date){
        month=month.toLowerCase();
        if(month.equals("march") && (date>=20)){
            return true;
        }else if(month.equals("april") && ( date>=1 && date<=30)){
            return true;
        }else if(month.equals("may") && ( date>=1 && date<=31)){
            return true;
        }else if(month.equals("june") && ( date>=1 && date<=20)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month & date: ");
        String month=sc.next();
        int date=sc.nextInt();
        if(isSpringSeason(month,date)){
            System.out.println("It's a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
}
