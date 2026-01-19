import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];  //  array named heights of size 11

        System.out.println("Enter the heights of 11 football players:");

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        // Calculating sum of all elements
        double sum = 0.0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        // mean: sum of all elements / number of elements
        double mean = sum / 11;

        System.out.printf("Mean height of football team: %.2f %n", mean);
    }
}
