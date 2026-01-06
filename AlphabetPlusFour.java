import java.util.Scanner;

public class AlphabetPlusFour {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    sb.append((char) ('a' + (c - 'a' + 4) % 26));
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
