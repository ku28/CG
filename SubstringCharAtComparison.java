import java.util.Scanner;

public class SubstringCharAtComparison {

    public static String createSubstringByCharAt(String text, int start, int end) {
        if (text == null) {
            return null;
        }
        if (start < 0) {
            start = 0;
        }
        if (end > text.length()) {
            end = text.length();
        }
        if (start > end) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }

    public static boolean compareByCharAt(String first, String second) {
        if (first == null || second == null) {
            return (first == null ? second == null : first.equals(second));
        }
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();

            String manualSubstring = createSubstringByCharAt(text, start, end);
            String builtinSubstring = text.substring(start, end);

            boolean same = compareByCharAt(manualSubstring, builtinSubstring);

            System.out.println("Manual substring: " + manualSubstring);
            System.out.println("Built-in substring: " + builtinSubstring);
            System.out.println("Both substrings are same: " + same);
        }
    }
}
