import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}
