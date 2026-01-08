import java.util.Scanner;

public class LengthFinderWithoutBuiltIn {

    public static int findLengthManual(String text) {
        if (text == null) {
            return 0;
        }
        int count = 0;
        try {
            while (true) {
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when count reaches the end of string
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.next();

            int manualLength = findLengthManual(text);
            int builtInLength = text.length();

            System.out.println("Manual length: " + manualLength);
            System.out.println("Built-in length: " + builtInLength);
            System.out.println("Results match: " + (manualLength == builtInLength));
        }
    }
}
