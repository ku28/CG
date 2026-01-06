import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            int[] multiplicationResult = new int[4];
            
            for (int i = 6; i <= 9; i++) {
                multiplicationResult[i - 6] = number * i;
            }
            
            System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            }
        }
    }
}
