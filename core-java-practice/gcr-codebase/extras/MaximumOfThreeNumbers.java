import java.util.Scanner;
public class MaximumOfThreeNumbers {
    // Function to take integer input from the user
    public static int takeInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }
    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        // Take input
        int num1 = takeInput("Enter first number: ");
        int num2 = takeInput("Enter second number: ");
        int num3 = takeInput("Enter third number: ");
        // Find maximum
        int max = findMaximum(num1, num2, num3);
        // Display result
        System.out.println("Maximum number is: " + max);
    }
}
