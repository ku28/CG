import java.util.Scanner;

public class LargestDigitsExpanded {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            long number = sc.nextLong();
            
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;
            
            long tempNumber = Math.abs(number);
            
            while (tempNumber != 0) {
                if (index == maxDigit) {
                    maxDigit = maxDigit + 10;
                    int[] temp = new int[maxDigit];
                    System.arraycopy(digits, 0, temp, 0, digits.length);
                    digits = temp;
                }

                digits[index] = (int)(tempNumber % 10);
                tempNumber = tempNumber / 10;
                index++;
            }
            
            int largest = 0;
            int secondLargest = 0;
            
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }
            
            System.out.println("\nTotal digits processed: " + index);
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
