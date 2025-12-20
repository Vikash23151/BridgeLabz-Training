import java.util.Arrays;
import java.util.Scanner;

public class LargestSecondLargestDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        // finding no. of digits by converting int to string & by using length()
        int len=String.valueOf(num).length();
        int[] digits=new int[len];
        // storing digits in array
        for(int i=0;i<len;i++){
            digits[i]= Math.toIntExact(num % 10);
            num/=10;
        }
        Arrays.sort(digits); // sorting the array in ascending
        System.out.println("Largest element: "+digits[len-1]);
        System.out.println("Second Largest element: "+digits[len-2]);
    }
}
