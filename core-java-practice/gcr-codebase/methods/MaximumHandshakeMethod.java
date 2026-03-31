import java.util.Scanner;

public class MaximumHandshakeMethod {
    static int numberOfHandshake(int n){
        return (n*(n-1))/2; // formula to calculate handshakes
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of students: ");
        int n=sc.nextInt(); // n-> no. of students
        System.out.println("Number of handshakes: "+numberOfHandshake(n));
    }
}
