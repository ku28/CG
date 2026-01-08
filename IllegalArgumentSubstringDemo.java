import java.util.Scanner;

public class IllegalArgumentSubstringDemo {

    public static void generateIllegalArgument(String text) {
        // Start index greater than end index will cause IllegalArgumentException
        String sub = text.substring(3, 1);
        System.out.println(sub);
    }

    public static void handleIllegalArgument(String text) {
        try {
            String sub = text.substring(3, 1);
            System.out.println(sub);
        } catch (IllegalArgumentException iae) {
            System.out.println("Handled IllegalArgumentException: " + iae.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled generic RuntimeException: " + re.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();

            System.out.println("Generating IllegalArgumentException:");
            try {
                generateIllegalArgument(text);
            } catch (IllegalArgumentException iae) {
                System.out.println("Exception observed in main: " + iae);
            }

            System.out.println("\nHandling IllegalArgumentException inside method:");
            handleIllegalArgument(text);
        }
    }
}
