import java.util.Scanner;

public class GradeAndPercentageUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // marks[i][0] = Physics, marks[i][1] = Chemistry, marks[i][2] = Maths
        int[][] marks = new int[n][3];
        int[] percentage = new int[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("Physics: ");
                else if (j == 1)
                    System.out.print("Chemistry: ");
                else
                    System.out.print("Maths: ");

                marks[i][j] = sc.nextInt();

                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    j--;   // decrement subject index
                }
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total * 100) / 300;

            // Assign grade
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
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                    " Physics: " + marks[i][0] +
                    " Chemistry: " + marks[i][1] +
                    " Maths: " + marks[i][2] +
                    " Percentage: " + percentage[i] + "%" +
                    " Grade: " + grade[i]
            );
        }
    }
}
