import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] ages = new double[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Take user input for age and height
        System.out.println("Enter age & height of Amar, Akbar & Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
        }
        // Find youngest
        double minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        // Find tallest
        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest: " + friends[youngestIndex] + " (age: " + minAge + ")");
        System.out.println("Tallest: " + friends[tallestIndex] + " (height: " + maxHeight + "cm)");

    }
}
