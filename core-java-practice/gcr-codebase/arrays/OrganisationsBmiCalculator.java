import java.util.Scanner;

public class OrganisationsBmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of person");
        int numOfPerson=sc.nextInt();
        double[] weightArray=new double[numOfPerson];
        double[] heightArray=new double[numOfPerson];
        double[] bmiArray=new double[numOfPerson];
        String[] statusArray=new String[numOfPerson];
        for(int i=0;i<numOfPerson;i++) {
            System.out.print("Enter Weight & height (cm): ");
            double weight = sc.nextDouble();
            double heightCm = sc.nextDouble();
            // Converting height from cm to meters {divide by 100}
            double height = heightCm / 100.0;

            // formula of BMI: weight / (height * height)
            double bmi = weight / (height * height);
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
            weightArray[i]=weight;
            heightArray[i]=height;
            bmiArray[i]=bmi;
            statusArray[i]=status;
        }
        for(int i=0;i<numOfPerson;i++){
            System.out.println("height: "+heightArray[i]+", weight: "+weightArray[i]+", BMI "+bmiArray[i]+", and status: "+statusArray[i]);
        }
    }
}
