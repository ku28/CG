import java.util.Scanner;

public class SumCompareWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n > 0) {
                int sumWhile = 0, i = 1;
                while (i <= n) {
                    sumWhile += i;
                    i++;
                }
                int sumFormula = n * (n + 1) / 2;
                System.out.println("While Loop Sum: " + sumWhile);
                System.out.println("Formula Sum: " + sumFormula);
            }
        }
    }
}
