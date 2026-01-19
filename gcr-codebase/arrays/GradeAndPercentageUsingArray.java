import java.util.Scanner;

public class GradeAndPercentageUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        char[] grade = new char[n];
        int[] percentage = new int[n];
        // Input marks
        for (int i = 0; i < n; i++) {

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) * 100 / 300;

            // grade assignment
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1)+" Physics: " + physics[i]+" Chemistry: "
            + chemistry[i]+" Maths: " + maths[i]+" Percentage: " + percentage[i] + "%"+" Grade: "
            + grade[i]);
        }
    }
}
