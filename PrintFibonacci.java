import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.print(a + ", " + b);
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }
        }
    }
}
