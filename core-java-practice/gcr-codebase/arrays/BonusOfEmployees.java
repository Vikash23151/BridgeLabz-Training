import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // array initialization
        double[] salary=new double[10];
        double[] years=new double[10];
        double[] newSalary=new double[10];
        double[] bonus=new double[10];
        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;
        System.out.println("Enter the salary & years of employees: ");
        for(int i=0;i<10;i++){
            double s=sc.nextDouble();
            double y=sc.nextDouble();
            if(s<=0 || y<=0){
                System.out.println("invalid, enter again");
                i--;
            }
            salary[i]=s;
            if(y>5){
                bonus[i]=(s*5)/100;
            }else{
                bonus[i]=(s*2)/100;
            }
            newSalary[i]=salary[i]+bonus[i];
            totalNewSalary+=newSalary[i];
            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
        }
        System.out.println("total bonus payout: "+totalBonus);
        System.out.println("total old salary: "+totalOldSalary);
        System.out.println("total new salary: "+totalNewSalary);
    }
}
