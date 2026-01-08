import java.util.Scanner;

public class CharFrequencyFinder {

    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[][] frequencies = findCharacterFrequencies(text);

            System.out.println("Character\tFrequency");
            System.out.println("---------------------");
            for (String[] frequencie : frequencies) {
                System.out.println(frequencie[0] + "\t\t" + frequencie[1]);
            }
        }
    }
}
