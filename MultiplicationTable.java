import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            int[] multiplicationTable = new int[10];
            
            for (int i = 1; i <= 10; i++) {
                multiplicationTable[i - 1] = number * i;
            }
            
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
            }
        }
    }
}
