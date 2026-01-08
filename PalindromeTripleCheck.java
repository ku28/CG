import java.util.Scanner;

public class PalindromeTripleCheck {

    public static boolean isPalindromeMethod1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeMethod2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeMethod2(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static boolean isPalindromeMethod3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            boolean result1 = isPalindromeMethod1(text);
            boolean result2 = isPalindromeMethod2(text, 0, text.length() - 1);
            boolean result3 = isPalindromeMethod3(text);

            System.out.println("Palindrome check (Method 1 - Iterative): " + result1);
            System.out.println("Palindrome check (Method 2 - Recursive): " + result2);
            System.out.println("Palindrome check (Method 3 - Array Comparison): " + result3);
        }
    }
}
