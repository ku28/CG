import java.util.Scanner;

public class NumberFormatParsingDemo {

    public static void generateNumberFormatException(String text) {
        int value = Integer.parseInt(text);
        System.out.println("Parsed value: " + value);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int value = Integer.parseInt(text);
            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException nfe) {
            System.out.println("Handled NumberFormatException: " + nfe.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled generic RuntimeException: " + re.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();

            System.out.println("Generating NumberFormatException:");
            try {
                generateNumberFormatException(text);
            } catch (NumberFormatException nfe) {
                System.out.println("Exception observed in main: " + nfe);
            }

            System.out.println("\nHandling NumberFormatException inside method:");
            handleNumberFormatException(text);
        }
    }
}
