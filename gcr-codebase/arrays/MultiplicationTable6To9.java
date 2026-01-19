import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];  // Array to store results from 6 to 9

        // For loop from 6 to 9 to store multiplication results
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display results from array in specified format
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
    }
}
