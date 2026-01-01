import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double kilometers = sc.nextDouble();
            double miles = kilometers * 0.621371;
            System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
        }
    }
}
