import java.util.Scanner;

public class StringIndexBoundsDemo {

    public static void generateStringIndexException(String text) {
        int index = text.length(); // out of bounds index
        char ch = text.charAt(index);
        System.out.println("Character: " + ch);
    }

    public static void handleStringIndexException(String text) {
        try {
            int index = text.length();
            char ch = text.charAt(index);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + sie.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();

            System.out.println("Generating StringIndexOutOfBoundsException:");
            try {
                generateStringIndexException(text);
            } catch (StringIndexOutOfBoundsException sie) {
                System.out.println("Exception observed in main: " + sie);
            }

            System.out.println("\nHandling StringIndexOutOfBoundsException inside method:");
            handleStringIndexException(text);
        }
    }
}
