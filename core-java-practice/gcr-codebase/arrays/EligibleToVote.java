import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of 10 integers
        int[] ages = new int[10];

        // taking input of ages
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("The student with the age " + age + " has an invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
