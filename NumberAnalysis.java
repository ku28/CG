import java.util.Scanner;

public class NumberAnalysis {
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = new int[5];
            
            for (int i = 0; i < 5; i++) {
                numbers[i] = sc.nextInt();
            }
            
            for (int i = 0; i < numbers.length; i++) {
                if (isPositive(numbers[i])) {
                    if (isEven(numbers[i])) {
                        System.out.println(numbers[i] + " is positive and even");
                    } else {
                        System.out.println(numbers[i] + " is positive and odd");
                    }
                } else {
                    System.out.println(numbers[i] + " is negative");
                }
            }
            
            int comparisonResult = compare(numbers[0], numbers[4]);
            
            switch (comparisonResult) {
                case 1 -> System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ")");
                case 0 -> System.out.println("First element (" + numbers[0] + ") is equal to last element (" + numbers[4] + ")");
                default -> System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ")");
            }
        }
    }
}
