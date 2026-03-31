import java.util.Scanner;
public class FactorialUsingRecursion {
  public static int takeInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    return sc.nextInt();
  }
  public static int factorial(int n){
    if(n==1){
      return 1;
    }
    return n*factorial(n-1);
  }
  public static void main(String[] args) {
    int n = takeInput();
    System.out.println("Factorial: "+factorial(n));
  }
}
