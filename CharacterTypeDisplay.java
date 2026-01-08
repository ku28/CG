import java.util.Scanner;

public class CharacterTypeDisplay {

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeCharacters(String text) {
        String[][] results = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            results[i][0] = String.valueOf(ch);
            results[i][1] = checkCharacterType(ch);
        }

        return results;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("---------------------");
        for (String[] data1 : data) {
            System.out.println(data1[0] + "\t\t" + data1[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();

            String[][] analysis = analyzeCharacters(text);
            displayTable(analysis);
        }
    }
}
