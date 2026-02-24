import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int maxLength = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    String substring = s.substring(i, j);
                    if (isUnique(substring)) {
                        maxLength = Math.max(maxLength, substring.length());
                    }
                }
            }
            System.out.println(maxLength);
        }
    }

    private static boolean isUnique(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
