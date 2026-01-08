import java.util.Scanner;

public class StringCompareUsingCharAt {

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
            String first = sc.next();
            String second = sc.next();

            boolean manualResult = compareByCharAt(first, second);
            boolean equalsResult = first.equals(second);

            System.out.println("Manual comparison result: " + manualResult);
            System.out.println("String.equals() result: " + equalsResult);
            System.out.println("Results are same: " + (manualResult == equalsResult));
        }
    }
}
