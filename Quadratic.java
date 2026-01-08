import java.util.Scanner;

public class Quadratic {
    
    public static double[] findRoots(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminant > 0) {
            double sqrtDelta = Math.sqrt(discriminant);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[] {root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            return new double[0];
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            double[] roots = findRoots(a, b, c);
            
            switch (roots.length) {
                case 2 -> {
                    System.out.println("Two roots:");
                    System.out.println("Root 1: " + roots[0]);
                    System.out.println("Root 2: " + roots[1]);
                }
                case 1 -> {
                    System.out.println("One root:");
                    System.out.println("Root: " + roots[0]);
                }
                default -> System.out.println("No real roots (discriminant is negative)");
            }
        }
    }
}
