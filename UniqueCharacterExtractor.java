import java.util.Scanner;

public class UniqueCharacterExtractor {

    public static int findLengthManual(String text) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLengthManual(text);
        if (length == 0) {
            return new char[0];
        }

        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount++] = currentChar;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempUnique, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            char[] uniqueChars = findUniqueCharacters(text);

            System.out.print("Unique characters: ");
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
