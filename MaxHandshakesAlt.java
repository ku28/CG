import java.util.Scanner;

public class MaxHandshakesAlt {
    
    public static int calculateMaxHandshakes(int n) {
        // Using combination formula: n * (n - 1) / 2
        return (n * (n - 1)) / 2;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfStudents = sc.nextInt();
            
            int maxHandshakes = calculateMaxHandshakes(numberOfStudents);
            
            System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        }
    }
}
