import java.util.Scanner;

public class NumberAnalyse {

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println(); // for space
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            // checking if number is positive and odd & even
            if (isPositive(n)) {
                System.out.println(n + " is Positive and " + (isEven(n) ? "Even" : "Odd"));
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        int cmp = compare(first, last);

        System.out.println(); // for space
        // comparing first & last element
        if (cmp == 0) {
            System.out.println("First element " + first + " is Equal to last element " + last);
        } else if (cmp == 1) {
            System.out.println("First element " + first + " is Greater than last element " + last);
        } else {
            System.out.println("First element " + first + " is Less than last element " + last);
        }
    }
}
