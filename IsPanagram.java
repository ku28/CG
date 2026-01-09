import java.util.Scanner;

public class IsPanagram {
    public static boolean isPanagram(String str) {
        boolean[] alphabet = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine().toLowerCase();
            if (isPanagram(input)) {
                System.out.println("Panagram.");
            } else {
                System.out.println("Not Panagram.");
            }
        }
    }
}
