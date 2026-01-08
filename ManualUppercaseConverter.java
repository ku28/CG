import java.util.Scanner;

public class ManualUppercaseConverter {

    public static String toUppercaseManual(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            builder.append(ch);
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
            String text = sc.nextLine();

            String manualUpper = toUppercaseManual(text);
            String builtInUpper = text.toUpperCase();

            boolean same = compareByCharAt(manualUpper, builtInUpper);

            System.out.println("Manual uppercase: " + manualUpper);
            System.out.println("Built-in uppercase: " + builtInUpper);
            System.out.println("Both uppercase results are same: " + same);
        }
    }
}
