import java.util.Scanner;

public class NumberCheckerPalindromeDuck {

    public static int countDigits(int number) {
        int n = Math.abs(number);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] toDigitsArray(int number) {
        int n = Math.abs(number);
        int len = countDigits(n);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    // Duck number: contains at least one zero digit and is not zero itself
    public static boolean isDuckNumber(int[] digits) {
        boolean hasZero = false;
        for (int d : digits) {
            if (d == 0) {
                hasZero = true;
                break;
            }
        }
        return hasZero;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            int[] digits = toDigitsArray(number);
            int[] reversed = reverseDigits(digits);

            System.out.println("Number: " + number);

            System.out.print("Digits: ");
            for (int d : digits) {
                System.out.print(d + " ");
            }
            System.out.println();

            System.out.print("Reversed digits: ");
            for (int d : reversed) {
                System.out.print(d + " ");
            }
            System.out.println();

            System.out.println("Palindrome: " + isPalindrome(digits));
            System.out.println("Duck number: " + isDuckNumber(digits));
        }
    }
}
