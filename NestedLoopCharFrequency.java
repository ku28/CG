import java.util.Scanner;

public class NestedLoopCharFrequency {

    public static String[] findFrequenciesNested(String text) {
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }

            frequencies[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequencies[i]++;
                    characters[j] = '0';
                }
            }
        }

        int resultCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                resultCount++;
            }
        }

        String[] result = new String[resultCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + ":" + frequencies[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[] frequencies = findFrequenciesNested(text);

            System.out.println("Character\tFrequency");
            System.out.println("---------------------");
            for (String entry : frequencies) {
                String[] parts = entry.split(":");
                System.out.println(parts[0] + "\t\t" + parts[1]);
            }
        }
    }
}
