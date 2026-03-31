import java.util.Scanner;

public class FriendsStats {

    public static String findYoungest(String[] names, int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[min]) {
                min = i;
            }
        }
        return names[min];
    }

    public static String findTallest(String[] names, double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[max]) {
                max = i;
            }
        }
        return names[max];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("\nYoungest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

    }
}
