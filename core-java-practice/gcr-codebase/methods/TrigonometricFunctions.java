import java.util.Scanner;

public class TrigonometricFunctions {
    static double[] calculateTrigonometricFunction(double angle){
        angle=Math.toRadians(angle);
        double sine=Math.sin(angle);
        double cosine=Math.cos(angle);
        double tangent=Math.tan(angle);
        return new double[]{sine,cosine,tangent};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle in degree: ");
        double angle=sc.nextDouble();
        double[] trigValues=calculateTrigonometricFunction(angle);
        System.out.println("Sine: "+trigValues[0]+", Cosine: "+trigValues[1]+" & Tangent: "+trigValues[2]);
    }
}
