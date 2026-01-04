import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            boolean result = (a < b && a < c);
            System.out.println("Is the first number the smallest? " + result);
        }
    }
}
