import java.util.Scanner;

public class SumOfNaturalNumber {
    static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num=sc.nextInt();
        System.out.println("Sum of "+num+" Natural number: "+calculateSum(num));
    }
}
