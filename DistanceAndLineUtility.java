import java.util.Scanner;

public class DistanceAndLineUtility {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return new double[0];
        }
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[] { slope, intercept };
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double distance = euclideanDistance(x1, y1, x2, y2);
            System.out.println("Euclidean distance: " + distance);

            double[] lineParams = lineEquation(x1, y1, x2, y2);
            if (lineParams.length == 0) {
                System.out.println("The line is vertical; slope is undefined.");
            } else {
                System.out.println("Line equation parameters (slope m, intercept b):");
                System.out.println("m = " + lineParams[0]);
                System.out.println("b = " + lineParams[1]);
            }
        }
    }
}
