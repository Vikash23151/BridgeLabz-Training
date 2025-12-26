import java.util.Scanner;

public class FourDigitRandomNumber {
    static int[] generate4DigitRandomArray(int size){
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=(int) (Math.random()*9000)+1000;
        }
        return array;
    }
    static double[] findAverageMinMax(int[] numbers){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        long sum=0;
        for(int num: numbers){
            if(num<min) min=num;
            if(num>max) max=num;
            sum+=num;
        }
        double avg=sum/numbers.length;
        return new double[]{avg,min,max};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] fourDigitNumberArray=generate4DigitRandomArray(size);
        double[] operationsResultArray=findAverageMinMax(fourDigitNumberArray);
        System.out.println("Average: "+operationsResultArray[0]);
        System.out.println("Minimum: "+operationsResultArray[1]);
        System.out.println("Maximum: "+operationsResultArray[2]);
    }
}
