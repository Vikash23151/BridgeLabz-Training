import java.util.Scanner;

public class TwoDArrayToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows & columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // take input of 2D array elements
        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create 1D array of size rows*columns
        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 2D array
        System.out.println("2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // display 1D array
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
