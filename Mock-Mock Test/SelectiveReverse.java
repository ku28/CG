import java.util.Scanner;

public class SelectiveReverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 1) {
                    words[i] = new StringBuilder(words[i]).reverse().toString();
                }
            }
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
