import java.util.Scanner;

public class NumInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num; // making copy of num
        // no. of digits of the num
        int len=String.valueOf(num).length();
        int[] digits=new int[len];
        // storing digits
        for(int i=0;i<len;i++){
            digits[i]=num % 10;
            num/=10;
        }
        System.out.println("Original number: "+temp);
        System.out.print("Reversed number: ");
        for(int i=0;i<len;i++){
            System.out.print(digits[i]);
        }
    }
}
