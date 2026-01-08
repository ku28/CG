import java.util.Scanner;

public class NumberCheckerHarshadFrequency {

    public static int countDigits(int number) {
        int n = Math.abs(number);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] toDigitsArray(int number) {
        int n = Math.abs(number);
        int len = countDigits(n);
        int[] digits = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) {
            return false;
        }
        return number % sum == 0;
    }

    public static int[][] digitFrequencies(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            int[] digits = toDigitsArray(number);

            System.out.println("Number: " + number);

            int sum = sumOfDigits(digits);
            int sumSquares = sumOfSquaresOfDigits(digits);

            System.out.println("Sum of digits: " + sum);
            System.out.println("Sum of squares of digits: " + sumSquares);
            System.out.println("Harshad number: " + isHarshadNumber(number, digits));

            int[][] frequencies = digitFrequencies(digits);
            System.out.println("Digit frequencies (digit : count):");
            for (int[] frequencie : frequencies) {
                if (frequencie[1] > 0) {
                    System.out.println(frequencie[0] + " : " + frequencie[1]);
                }
            }
        }
    }
}
