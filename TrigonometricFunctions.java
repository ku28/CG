import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double angle = sc.nextDouble();
            double[] result = calculateTrigonometricFunctions(angle);

            System.out.println("Sine(" + angle + "°) = " + result[0]);
            System.out.println("Cosine(" + angle + "°) = " + result[1]);
            System.out.println("Tangent(" + angle + "°) = " + result[2]);
        }
    }
}
