import java.util.Scanner;

public class TextSplitterComparison {

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

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        inWord = false;
        int currentWord = 1;

        for (int i = 0; i < textLength; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (inWord) {
                    spaceIndexes[currentWord] = i;
                    currentWord++;
                    inWord = false;
                }
            } else {
                if (!inWord) {
                    inWord = true;
                }
            }
        }
        if (currentWord == wordCount) {
            spaceIndexes[wordCount] = textLength;
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIndexes[i] + 1;
            int end = spaceIndexes[i + 1];
            StringBuilder builder = new StringBuilder();
            for (int j = start; j < end; j++) {
                builder.append(text.charAt(j));
            }
            words[i] = builder.toString();
        }

        return words;
    }

    public static boolean compareStringArrays(String[] first, String[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[] manualWords = splitWordsManual(text);
            String[] builtInWords = text.split(" ");

            boolean same = compareStringArrays(manualWords, builtInWords);

            System.out.println("Manual split count: " + manualWords.length);
            System.out.println("Built-in split count: " + builtInWords.length);
            System.out.println("Arrays are equal: " + same);
        }
    }
}
