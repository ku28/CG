import java.util.Scanner;

public class AnagramVerifier {

    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            char ch1 = text1.charAt(i);
            frequency1[ch1]++;
        }

        for (int i = 0; i < text2.length(); i++) {
            char ch2 = text2.charAt(i);
            frequency2[ch2]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text1 = sc.nextLine();
            String text2 = sc.nextLine();

            boolean result = areAnagrams(text1, text2);

            System.out.println("Are anagrams: " + result);
        }
    }
}
