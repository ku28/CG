import java.util.Scanner;

public class DigitFrequency {
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
            
            tempNumber = Math.abs(number);
            while (tempNumber != 0 || index == 0) {
                digits[index] = (int)(tempNumber % 10);
                tempNumber = tempNumber / 10;
                index++;
                if (index >= digitCount) break;
            }
            
            int[] frequency = new int[10];
            
            for (int i = 0; i < digitCount; i++) {
                frequency[digits[i]]++;
            }
            
            System.out.println("\n--- Digit Frequency Report ---");
            System.out.println("Digit\tFrequency");
            System.out.println("-----\t---------");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println(i + "\t" + frequency[i]);
                }
            }
        }
    }
}
