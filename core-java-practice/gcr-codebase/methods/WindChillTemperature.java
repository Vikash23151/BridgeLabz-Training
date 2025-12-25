import java.util.Scanner;

public class WindChillTemperature {
    static double calculateWindChill(double temp, double windSpeed){
        double windChill=35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature & wind speed: ");
        double temperature=sc.nextDouble();
        double windSpeed=sc.nextDouble();
        System.out.println("WindChill: "+calculateWindChill(temperature,windSpeed));
    }
}
