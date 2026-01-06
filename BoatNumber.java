import java.util.Scanner;

public class BoatNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            
            int temp = n;
            boolean hasEight = false;
            
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 8) {
                    hasEight = true;
                }
                temp = temp / 10;
            }

            int firstDigit = n;
            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }
            
            if (hasEight && firstDigit != 8) {
                System.out.println("It is a Boat Number");
            } else {
                System.out.println("It is NOT a Boat Number");
            }
        }
    }
}
