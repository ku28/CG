public class NullPointerDemoStrings {

    public static void generateNullPointer() {
        String text = null;
        // Check for null before accessing length
        int length = (text != null) ? text.length() : 0;
        System.out.println("Length: " + length);
    }

    public static void demonstrateNullPointerHandling() {
        String text = null;
        int length = (text != null) ? text.length() : 0;
        System.out.println("Length: " + length);
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException without handling in method:");
        try {
            generateNullPointer();
        } catch (NullPointerException npe) {
            System.out.println("Exception observed in main: " + npe);
        }

        System.out.println("\nHandling NullPointerException inside method:");
        demonstrateNullPointerHandling();
    }
}
