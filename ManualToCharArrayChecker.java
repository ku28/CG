import java.util.Scanner;

public class ManualToCharArrayChecker {

    public static char[] extractCharacters(String text) {
        if (text == null) {
            return new char[0];
        }
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] first, char[] second) {
        if (first == null || second == null) {
            return first == second;
        }
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

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();

            char[] manualChars = extractCharacters(text);
            char[] builtinChars = text.toCharArray();

            boolean same = compareCharArrays(manualChars, builtinChars);

            System.out.println("Manual char array length: " + manualChars.length);
            System.out.println("Built-in char array length: " + builtinChars.length);
            System.out.println("Arrays are equal: " + same);
        }
    }
}
