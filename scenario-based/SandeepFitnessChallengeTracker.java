import java.util.Scanner;

public class SandeepFitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] pushUpArray=new int[7];
        for(int i=0;i<7;i++){
            System.out.print("Enter the day "+(i+1)+" push-ups or 0 if rest day: ");
            pushUpArray[i]=sc.nextInt();
        }
        int totalPushups=0;
        for(int pushUp:pushUpArray){
            totalPushups+=pushUp;
        }
        System.out.println("Total Push-Ups: "+totalPushups);
        System.out.println("Average of push-ups per week: "+totalPushups/7);
    }
}
