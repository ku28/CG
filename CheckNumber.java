import java.util.Scanner;

public class CheckNumber {
    
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            
            int result = checkNumber(number);
            
            switch (result) {
                case 1 -> System.out.println("The number is positive.");
                case -1 -> System.out.println("The number is negative.");
                default -> System.out.println("The number is zero.");
            }
        }
    }
}