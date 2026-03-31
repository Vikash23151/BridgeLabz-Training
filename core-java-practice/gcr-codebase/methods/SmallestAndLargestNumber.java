import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestNumber {
    static int[] findSmallestAndLargest(int[] numArray){
        Arrays.sort(numArray);
        return new int[]{numArray[0],numArray[2]};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int[] numArray=new int[3];
        for(int i=0;i<3;i++){
            numArray[i]=sc.nextInt();
        }
        int[] result=findSmallestAndLargest(numArray);
        System.out.println("Smallest number: "+result[0]+"\nLargest Number: "+result[1]);
    }
}
