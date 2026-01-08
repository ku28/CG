import java.util.Scanner;

public class NumberCheckerFactorTypes {

    public static int[] findFactors(int number) {
        int n = Math.abs(number);
        if (n == 0) {
            return new int[0];
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestProperFactor(int number, int[] factors) {
        int n = Math.abs(number);
        int max = 1;
        for (int factor : factors) {
            if (factor < n && factor > max) {
                max = factor;
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1L;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1.0;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    private static int sumOfProperDivisors(int number, int[] factors) {
        int n = Math.abs(number);
        int sum = 0;
        for (int f : factors) {
            if (f < n) {
                sum += f;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number, int[] factors) {
        int sumProper = sumOfProperDivisors(number, factors);
        return sumProper == Math.abs(number) && number != 0;
    }

    public static boolean isAbundantNumber(int number, int[] factors) {
        int sumProper = sumOfProperDivisors(number, factors);
        return sumProper > Math.abs(number);
    }

    public static boolean isDeficientNumber(int number, int[] factors) {
        int sumProper = sumOfProperDivisors(number, factors);
        return sumProper < Math.abs(number);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrongNumber(int number) {
        int n = Math.abs(number);
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            int[] factors = findFactors(number);

            System.out.print("Factors: ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            int greatestFactor = greatestProperFactor(number, factors);
            int sum = sumOfFactors(factors);
            long product = productOfFactors(factors);
            double productCubes = productOfCubesOfFactors(factors);

            System.out.println("Greatest proper factor: " + greatestFactor);
            System.out.println("Sum of factors: " + sum);
            System.out.println("Product of factors: " + product);
            System.out.println("Product of cubes of factors: " + productCubes);

            System.out.println("Perfect number: " + isPerfectNumber(number, factors));
            System.out.println("Abundant number: " + isAbundantNumber(number, factors));
            System.out.println("Deficient number: " + isDeficientNumber(number, factors));
            System.out.println("Strong number: " + isStrongNumber(number));
        }
    }
}
