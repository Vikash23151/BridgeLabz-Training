import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Enter positive integer");
        }else{
            //initialize string array
            String[] arr=new String[num+1];
            //check & store if multiple of 3=fizz,5=buzz & both=fizzbuzz
            for(int i=0;i<=num;i++){
                if(i%3==0 && i%5==0){
                    arr[i]="FizzBuzz";
                }else if(i%3==0){
                    arr[i]="Fizz";
                }else if(i%5==0){
                    arr[i]="Buzz";
                }else{
                    arr[i]=String.valueOf(i);
                }
            }
            //display the array
            for(int i=0;i<=num;i++){
                System.out.println("Position "+i+" = "+arr[i]);
            }
        }
    }
}
