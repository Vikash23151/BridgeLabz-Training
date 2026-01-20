import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        // finding freq of each element
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        // finding distinct elements
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        // storing result
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }
    // displaying result
    public static void displayFrequency(String[][] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = findFrequency(input);
        displayFrequency(frequency);

        sc.close();
    }
}
