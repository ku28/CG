import java.util.Scanner;

public class TriangularParkRun {
    
    public static int calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        double perimeterInKm = perimeter / 1000; // Convert meters to kilometers
        return (int) Math.ceil(targetDistance / perimeterInKm);
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            
            int rounds = calculateRounds(side1, side2, side3, 5.0);
            
            System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");
        }
    }
}
