
import java.util.Scanner;

public class CmToFeetInches {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int heightInCm = sc.nextInt();
            double totalInches = heightInCm / 2.54;
            int feet = (int) (totalInches / 12);
            int inches = (int) (totalInches % 12);
            System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
        }
    }
}
