import java.util.Scanner;

public class FactorAnalysis {
    
    public static int[] findFactors(int number) {
        // First loop: count the factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Initialize array with the count
        int[] factors = new int[count];
        
        // Second loop: save factors into array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }
    
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static double findSumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            
            int[] factors = findFactors(number);
            
            System.out.print("Factors: ");
            for (int i = 0; i < factors.length; i++) {
                System.out.print(factors[i]);
                if (i < factors.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            
            int sum = findSumOfFactors(factors);
            long product = findProductOfFactors(factors);
            double sumOfSquares = findSumOfSquareOfFactors(factors);
            
            System.out.println("Sum of factors: " + sum);
            System.out.println("Product of factors: " + product);
            System.out.println("Sum of square of factors: " + sumOfSquares);
        }
    }
}
