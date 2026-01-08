import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfChocolates = sc.nextInt();
            int numberOfChildren = sc.nextInt();

            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get: " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }
    }
}
