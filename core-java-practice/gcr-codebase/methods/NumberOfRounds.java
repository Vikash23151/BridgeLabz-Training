import java.util.Scanner;

public class NumberOfRounds {
    static float calculateRounds(int a, int b, int c){
        int perimeter=a+b+c;
        return (float) (5000.0f/perimeter);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangle in meters: ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        System.out.println("Number of Rounds: "+calculateRounds(side1,side2,side3));
    }
}
