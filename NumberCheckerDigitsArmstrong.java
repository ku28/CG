import java.util.Scanner;

public class NumberCheckerDigitsArmstrong {

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
        int digitsCount = countDigits(n);
        int[] digits = new int[digitsCount];
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Duck number: contains at least one zero digit and is not zero itself
    public static boolean isDuckNumber(int[] digits) {
        boolean hasZero = false;
        for (int digit : digits) {
            if (digit == 0) {
                hasZero = true;
                break;
            }
        }
        return hasZero;
    }

    public static boolean isArmstrong(int[] digits) {
        int length = digits.length;
        int sum = 0;
        int original = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, length);
            original = original * 10 + digit;
        }
        return sum == original;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[] { largest, secondLargest };
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            int[] digits = toDigitsArray(number);
            int digitCount = digits.length;

            System.out.println("Number: " + number);
            System.out.println("Digit count: " + digitCount);

            System.out.print("Digits: ");
            for (int d : digits) {
                System.out.print(d + " ");
            }
            System.out.println();

            System.out.println("Duck number: " + isDuckNumber(digits));
            System.out.println("Armstrong number: " + isArmstrong(digits));

            int[] largestPair = largestAndSecondLargest(digits);
            int[] smallestPair = smallestAndSecondSmallest(digits);

            System.out.println("Largest digit: " + largestPair[0]);
            System.out.println("Second largest digit: " + largestPair[1]);
            System.out.println("Smallest digit: " + smallestPair[0]);
            System.out.println("Second smallest digit: " + smallestPair[1]);
        }
    }
}
