import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            String op = sc.next();

            switch (op) {
                case "+" -> System.out.println(first + second);
                case "-" -> System.out.println(first - second);
                case "*" -> System.out.println(first * second);
                case "/" -> System.out.println(first / second);
                default -> System.out.println("Invalid Operator");
            }
        }
    }
}
