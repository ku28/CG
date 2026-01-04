import java.util.Scanner;

public class SumCompareFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n > 0) {
                int sumFor = 0;
                for (int i = 1; i <= n; i++) {
                    sumFor += i;
                }
                int sumFormula = n * (n + 1) / 2;
                System.out.println("For Loop Sum: " + sumFor);
                System.out.println("Formula Sum: " + sumFormula);
            }
        }
    }
}
