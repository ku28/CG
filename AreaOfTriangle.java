import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            double areaInCm = (base * height) / 2;
            double areaInInches = areaInCm / (2.54 * 2.54);
            System.out.println("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " + areaInCm);
        }
    }
}
