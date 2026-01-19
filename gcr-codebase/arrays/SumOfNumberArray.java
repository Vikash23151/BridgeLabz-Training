import java.util.Scanner;

public class SumOfNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // Array of 10 elements of type double
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers");

        // Infinite while loop
        while (true) {
            double input = sc.nextDouble();

            // Break if user enters 0 or negative number or index limit is full
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }

        // calculate & display total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        System.out.println("Sum of all numbers: " + total);
    }
}
