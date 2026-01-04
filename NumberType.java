import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            if (number > 0)
                System.out.println("positive");
            else if (number < 0)
                System.out.println("negative");
            else
                System.out.println("zero");
        }
    }
}
