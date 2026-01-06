import java.util.Scanner;

public class LargestNumberWithoutDigit {
    public static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int d = sc.nextInt();
            for(int i = x; i >= 0; i--) {
                if (!containsDigit(i, d)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
