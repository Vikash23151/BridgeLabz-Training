import java.util.Scanner;

public class LargestSecondLargestDigitsDynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers by making absolute
        if (number < 0) {
            number = -number;
        }

        // Initial setup for digits array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[0] = 0;
            index = 1;
        } else {
            // Extract digits with dynamic resizing
            while (number > 0) {
                // If index equals maxDigit, increase array size
                if (index == maxDigit) {
                    maxDigit += 10;  // Increase by 10

                    // Create temp array and copy current digits
                    int[] temp = new int[maxDigit];
                    for (int i = 0; i < index; i++) {
                        temp[i] = digits[i];
                    }
                    digits = temp;  // Assign temp to digits array
                }

                // Store current digit
                digits[index] = number % 10;
                number /= 10;
                index++;
            }
        }

        // Find largest & second largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.print("Digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not found (all digits same)");
        }

        scanner.close();
    }
}
