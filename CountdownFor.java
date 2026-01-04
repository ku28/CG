import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}
