import java.util.Scanner;

public class CollinearityViaSlopeArea {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double left = (y2 - y1) * (x3 - x2);
        double right = (y3 - y2) * (x2 - x1);
        double diff = left - right;
        double epsilon = 1e-9;
        return Math.abs(diff) < epsilon;
    }

    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double areaExpression = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return 0.5 * Math.abs(areaExpression);
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = triangleArea(x1, y1, x2, y2, x3, y3);
        double epsilon = 1e-9;
        return area < epsilon;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
            boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

            System.out.println("Collinear (slope method): " + collinearSlope);
            System.out.println("Collinear (area method): " + collinearArea);
        }
    }
}
