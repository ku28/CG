import java.util.Scanner;

public class UnitConverter {
    
    // Kilometer and Miles conversions
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    
    // Meters and Feet conversions
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    // Yards and Feet conversions
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    // Meters and Inches conversions
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    // Inches and Centimeters conversions
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Weight conversions
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    
    // Volume conversions
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            double value = sc.nextDouble();
            double result;
            
            switch (choice) {
                case 1 -> result = convertKmToMiles(value);
                case 2 -> result = convertMilesToKm(value);
                case 3 -> result = convertMetersToFeet(value);
                case 4 -> result = convertFeetToMeters(value);
                case 5 -> result = convertYardsToFeet(value);
                case 6 -> result = convertFeetToYards(value);
                case 7 -> result = convertMetersToInches(value);
                case 8 -> result = convertInchesToMeters(value);
                case 9 -> result = convertInchesToCm(value);
                case 10 -> result = convertFahrenheitToCelsius(value);
                case 11 -> result = convertCelsiusToFahrenheit(value);
                case 12 -> result = convertPoundsToKilograms(value);
                case 13 -> result = convertKilogramsToPounds(value);
                case 14 -> result = convertGallonsToLiters(value);
                case 15 -> result = convertLitersToGallons(value);
                default -> {
                    System.out.println("Invalid choice"); return;
                }
            }
            
            System.out.println("Result: " + result);
            
            System.out.println("Result: " + result);
        }
    }
}
