import java.util.Scanner;

public class ManualTrimComparison {

    public static int[] findTrimBounds(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end + 1 };
    }

    public static String createSubstringByCharAt(String text, int start, int end) {
        if (text == null || start < 0 || end > text.length() || start >= end) {
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
            String text = sc.nextLine();

            int[] bounds = findTrimBounds(text);
            String manualTrim = createSubstringByCharAt(text, bounds[0], bounds[1]);
            String builtInTrim = text.trim();

            boolean same = compareByCharAt(manualTrim, builtInTrim);

            System.out.println("Manual trim: [" + manualTrim + "]");
            System.out.println("Built-in trim: [" + builtInTrim + "]");
            System.out.println("Results are same: " + same);
        }
    }
}
