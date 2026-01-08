import java.util.Scanner;

public class RecursiveSumNatural {
    
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            if (n < 1) {
                System.out.println("Not a natural number. Exiting.");
                return;
            }
            
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);
            
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            
            if (recursiveSum == formulaSum) {
                System.out.println("Both results are correct and equal: " + recursiveSum);
            }
        }
    }
}
