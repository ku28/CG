import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] findUniqueCharacters(String text) {
        if (text == null || text.length() == 0) {
            return new char[0];
        }

        char[] tempUnique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public static String[][] findFrequenciesWithUnique(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[][] frequencies = findFrequenciesWithUnique(text);

            System.out.println("Character\tFrequency");
            System.out.println("---------------------");
            for (String[] frequencie : frequencies) {
                System.out.println(frequencie[0] + "\t\t" + frequencie[1]);
            }
        }
    }
}
