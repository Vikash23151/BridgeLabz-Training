import java.util.Scanner;

public class BmiCalculatorUsingMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (meters): ");
            personData[i][0] = scanner.nextDouble();  // Index 0: height

            System.out.print("Enter weight (kg): ");
            personData[i][1] = scanner.nextDouble();  // Index 1: weight

            // Calculate BMI: weight / (height * height)
            double bmi = personData[i][1] / (personData[i][0] * personData[i][0]);
            personData[i][2] = bmi;  // Index 2: BMI

            // get weight status
            weightStatus[i] = getWeightStatus(bmi);
        }
        for(int i=0;i<number;i++){
            System.out.println("height: "+personData[i][0]+", weight: "+personData[i][1]+", BMI "+personData[i][2]+", and status: "+weightStatus[i]);
        }
    }

    // Method to determine status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }
}
