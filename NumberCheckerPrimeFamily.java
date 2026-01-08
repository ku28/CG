import java.util.Scanner;

public class NumberCheckerPrimeFamily {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(number);
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        int temp = square;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int n = Math.abs(number);
        int sum = 0;
        int product = 1;

        if (n == 0) {
            return false;
        }

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int n = Math.abs(number);
        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            System.out.println("Number: " + number);
            System.out.println("Prime: " + isPrime(number));
            System.out.println("Neon: " + isNeon(number));
            System.out.println("Spy: " + isSpy(number));
            System.out.println("Automorphic: " + isAutomorphic(number));
            System.out.println("Buzz: " + isBuzz(number));
        }
    }
}
