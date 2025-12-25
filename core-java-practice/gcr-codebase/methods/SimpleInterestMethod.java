import java.util.Scanner;

public class SimpleInterestMethod {
    static double calculate(int principal, int rate, int time){
        return (principal*rate*time)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal,rate & time");
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        System.out.println("Simple Interest: "+calculate(principal,rate,time));
    }
}
