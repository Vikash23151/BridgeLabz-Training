
import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temp in celcius");
        double celsius = sc.nextDouble();
        // formula: F = C * 9/5 + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Temp in Fahrenheit: " + fahrenheit);
    }
}
