import java.util.Scanner;

public class WordLengthMatrix {

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

    public static String[] splitWordsManual(String text) {
        if (text == null || findLengthManual(text) == 0) {
            return new String[0];
        }

        int textLength = findLengthManual(text);
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < textLength; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        StringBuilder builder = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < textLength; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                builder.append(ch);
            } else {
                if (findLengthManual(builder.toString()) > 0) {
                    words[wordIndex++] = builder.toString();
                    builder = new StringBuilder();
                }
            }
        }
        if (findLengthManual(builder.toString()) > 0) {
            words[wordIndex] = builder.toString();
        }

        return words;
    }

    public static String[][] createWordLengthMatrix(String[] words) {
        String[][] matrix = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            matrix[i][0] = words[i];
            int length = findLengthManual(words[i]);
            matrix[i][1] = String.valueOf(length);
        }
        return matrix;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[] words = splitWordsManual(text);
            String[][] wordLengthMatrix = createWordLengthMatrix(words);

            System.out.println("Word\tLength");
            System.out.println("--------------");
            for (String[] wordLengthMatrix1 : wordLengthMatrix) {
                String word = wordLengthMatrix1[0];
                int length = Integer.parseInt(wordLengthMatrix1[1]);
                System.out.println(word + "\t" + length);
            }
        }
    }
}
