
import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int feet = sc.nextInt();
            double yards = feet / 3.0;
            double miles = feet / 5280.0;
            System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        }
    }
}
