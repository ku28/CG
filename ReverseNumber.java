import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            long number = sc.nextLong();
            
            long tempNumber = Math.abs(number);
            int digitCount = 0;
            long temp = tempNumber;
            
            if (temp == 0) {
                digitCount = 1;
            } else {
                while (temp != 0) {
                    digitCount++;
                    temp = temp / 10;
                }
            }
            
            int[] digits = new int[digitCount];
            int index = 0;
            
            while (tempNumber != 0 || index == 0) {
                digits[index] = (int)(tempNumber % 10);
                tempNumber = tempNumber / 10;
                index++;
                if (index >= digitCount) break;
            }
            
            int[] reversedDigits = new int[digitCount];
            for (int i = 0; i < digitCount; i++) {
                reversedDigits[i] = digits[digitCount - 1 - i];
            }
            
            System.out.println("\nOriginal number: " + number);
            System.out.print("Reversed number: ");
            if (number < 0) {
                System.out.print("-");
            }
            for (int i = 0; i < digitCount; i++) {
                System.out.print(reversedDigits[i]);
            }
            System.out.println();
        }
    }
}
