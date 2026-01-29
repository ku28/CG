public class FibonacciComparison {
    public static void main(String[] args) {
        int[] sizes = {10, 20, 30, 40};
        
        for (int n : sizes) {
            long startTime = System.nanoTime();
            int recursiveResult = fibonacciRecursive(n);
            long endTime = System.nanoTime();
            double recursiveTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            int iterativeResult = fibonacciIterative(n);
            endTime = System.nanoTime();
            double iterativeTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("Fibonacci(" + n + ")");
            System.out.println("Recursive Time: " + recursiveTime + " ms");
            System.out.println("Iterative Time: " + iterativeTime + " ms");
            System.out.println("Recursive Result: " + recursiveResult);
            System.out.println("Iterative Result: " + iterativeResult);
            System.out.println();
        }
    }
    
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
