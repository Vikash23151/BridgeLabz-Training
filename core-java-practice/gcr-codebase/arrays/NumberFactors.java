import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors from 1 to number & store in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if array needs to be resized
                if (index == maxFactor) {
                    maxFactor *= 2;
                    // Create temp array to copy elements from factors array
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;  // Assign temp array to factors array
                }
                // Store factor in array
                factors[index] = i;
                index++;
            }
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
