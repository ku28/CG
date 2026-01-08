import java.util.Scanner;

public class MaxHandshakes {
    
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfStudents = sc.nextInt();
            
            int handshakes = calculateHandshakes(numberOfStudents);
            
            System.out.println("Maximum number of handshakes: " + handshakes);
        }
    }
}
