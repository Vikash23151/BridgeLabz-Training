import java.util.Scanner;

public class StudentVoteChecker {
    //method to check age and student can vote or not
    static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        //taking input and displaying result
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
        }
    }
}
