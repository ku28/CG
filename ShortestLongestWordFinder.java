import java.util.Scanner;

public class ShortestLongestWordFinder {

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

    public static int[] findShortestAndLongest(String[][] wordLengthMatrix) {
        if (wordLengthMatrix.length == 0) {
            return new int[] { -1, -1 };
        }

        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengthMatrix[0][1]);
        int longestLength = Integer.parseInt(wordLengthMatrix[0][1]);

        for (int i = 1; i < wordLengthMatrix.length; i++) {
            int currentLength = Integer.parseInt(wordLengthMatrix[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[] words = splitWordsManual(text);
            String[][] wordLengthMatrix = createWordLengthMatrix(words);
            int[] indexes = findShortestAndLongest(wordLengthMatrix);

            System.out.println("Shortest word: " + wordLengthMatrix[indexes[0]][0] + 
                             " (length: " + wordLengthMatrix[indexes[0]][1] + ")");
            System.out.println("Longest word: " + wordLengthMatrix[indexes[1]][0] + 
                             " (length: " + wordLengthMatrix[indexes[1]][1] + ")");
        }
    }
}
