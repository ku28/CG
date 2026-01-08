import java.util.Scanner;

public class ManualLowercaseConverter {

    public static String toLowercaseManual(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

            String manualLower = toLowercaseManual(text);
            String builtInLower = text.toLowerCase();

            boolean same = compareByCharAt(manualLower, builtInLower);

            System.out.println("Manual lowercase: " + manualLower);
            System.out.println("Built-in lowercase: " + builtInLower);
            System.out.println("Both lowercase results are same: " + same);
        }
    }
}
