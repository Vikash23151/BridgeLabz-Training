import java.util.Arrays;
import java.util.Scanner;

public class FactorsOfNumber {
    static int[] calculateFactors(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0) count++;
        }
        count=2*count; // factors always comes in pair
        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                factors[idx++]=i;
                factors[idx++]=num/i;
            }
        }
        Arrays.sort(factors);
        return factors;
    }
    static int calculateSumOfFactors(int[] factors){
        int sum=0;
        for(int factor:factors){
            sum+=factor;
        }
        return sum;
    }
    static long calculateProductOfFactors(int[] factors){
        long product=1;
        for(int factor:factors){
            product*=factor;
        }
        return product;
    }
    static int calculateSumOfSquaresOfFactors(int[] factors){
        int sum=0;
        for(int factor:factors){
            sum+=(int) Math.pow(factor,2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int[] factors=calculateFactors(num);
        int sumOfFactors=calculateSumOfFactors(factors);
        long productOfFactors=calculateProductOfFactors(factors);
        int sumOfSqauresOfFactors=calculateSumOfSquaresOfFactors(factors);
        System.out.print("Factors of "+num+" are: ");
        for(int factor:factors){
            System.out.print(factor+" ");
        }
        System.out.println("\nSum of Factors: "+sumOfFactors);
        System.out.println("Product of Factors: "+productOfFactors);
        System.out.println("Sum of Squares of Factors: "+sumOfSqauresOfFactors);
    }
}
