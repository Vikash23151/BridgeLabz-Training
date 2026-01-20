import java.util.Scanner;

public class SumOfNaturalNumbers {
    static int calculateSum(int num){
        if(num==1){
            return 1;
        }
        return num+calculateSum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Wrong input, Enter a natural number");
        }else{
            int sumUsingRecursion=calculateSum(num);
            int sumUsingFormula=(num*(num+1))/2;
            System.out.println("Sum using recursion: "+sumUsingRecursion+"\nSum using formula: "+sumUsingFormula);
        }
    }
}
