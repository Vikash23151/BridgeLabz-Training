import java.util.Scanner;

public class MayasBmiFitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input height (cm) & weight (kg)
        double height= sc.nextDouble()/100; // converting cm into m
        double weight= sc.nextDouble();
        double bmi=weight/(height*height);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("BMI: %.2f kg/m²\n", bmi);
        System.out.println("Status: " + status);
    }
}
