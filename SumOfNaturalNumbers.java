import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = calculateSum(n);

            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
}
