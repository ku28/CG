import java.util.Scanner;

public class RotationPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int n = s.length();
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int left = 0;
            int right = rotated.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (rotated.charAt(left) != rotated.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("True");
                result = true;
                break;
            }
        }

        if (!result) System.out.println("False");
    }
}