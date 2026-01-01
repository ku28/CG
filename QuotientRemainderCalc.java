
import java.util.Scanner;

public class QuotientRemainderCalc {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("The quotient is " + quotient + " and the remainder is " + remainder + " of two number " + dividend + " and " + divisor);
        }
    }
}
