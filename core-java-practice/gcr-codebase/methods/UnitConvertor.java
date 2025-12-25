public class UnitConvertor {

    // Length conversions
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // Temperature conversions
    private static final double F_TO_C_RATIO = 5.0 / 9.0;
    private static final double C_TO_F_RATIO = 9.0 / 5.0;
    private static final double CELSIUS_TO_FAHRENHEIT_OFFSET = 32.0;

    // Weight conversions
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;

    // Volume conversions
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    // Length Methods
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    // Temperature Methods
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - CELSIUS_TO_FAHRENHEIT_OFFSET) * F_TO_C_RATIO;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * C_TO_F_RATIO) + CELSIUS_TO_FAHRENHEIT_OFFSET;
    }

    // Weight Methods
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Volume Methods
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        System.out.println("=== Unit Converter Demo ===");

        // Length Conversions
        System.out.println("LENGTH CONVERSIONS:");
        System.out.printf("10 km = %.2f miles%n", convertKmToMiles(10));
        System.out.printf("10 miles = %.2f km%n", convertMilesToKm(10));
        System.out.printf("5 meters = %.2f feet%n", convertMetersToFeet(5));
        System.out.printf("6.5 feet = %.2f meters%n", convertFeetToMeters(6.5));
        System.out.printf("10 yards = %.1f feet%n", convertYardsToFeet(10));
        System.out.printf("10 feet = %.2f yards%n", convertFeetToYards(10));
        System.out.printf("2 meters = %.1f inches%n", convertMetersToInches(2));
        System.out.printf("5 inches = %.2f meters%n", convertInchesToMeters(5));
        System.out.printf("8 inches = %.1f cm%n", convertInchesToCm(8));
        System.out.println();

        // Temperature
        System.out.println("TEMPERATURE CONVERSIONS:");
        System.out.printf("98.6°F = %.1f°C%n", convertFahrenheitToCelsius(98.6));
        System.out.printf("37°C = %.1f°F%n", convertCelsiusToFahrenheit(37));

        // Weight Conversions
        System.out.println("WEIGHT CONVERSIONS:");
        System.out.printf("150 lbs = %.1f kg%n", convertPoundsToKilograms(150));
        System.out.printf("70 kg = %.1f lbs%n", convertKilogramsToPounds(70));

        // Volume Conversions
        System.out.println("VOLUME CONVERSIONS:");
        System.out.printf("5 gallons = %.1f liters%n", convertGallonsToLiters(5));
        System.out.printf("10 liters = %.2f gallons%n", convertLitersToGallons(10));
    }
}
