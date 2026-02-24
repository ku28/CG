import java.util.Scanner;

public class ToggleCaseByIndex {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (i % 2 == 0) {
                    output.append(Character.toUpperCase(c));
                } else {
                    output.append(Character.toLowerCase(c));
                }
            }
            System.out.println(output.toString());
        }
    }
}
