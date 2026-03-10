import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int n = sc.nextInt();
            String result = "";
            for (int i = 0; i < n; i++) {
                result += s;
            }
            System.out.println(result);
        }
    }
}
