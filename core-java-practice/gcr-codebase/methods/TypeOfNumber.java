import java.util.Scanner;

public class TypeOfNumber {
    static int numberIs(int num){
        if(num==0){
            return 0;
        }else if(num>0){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        System.out.println(numberIs(num));
    }
}
