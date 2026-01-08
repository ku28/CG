import java.util.Scanner;

public class ArrayIndexBoundsDemo {

    public static void generateArrayIndexException(String[] names) {
        int index = names.length; // always out of bounds
        String name = names[index];
        System.out.println("Name: " + name);
    }

    public static void handleArrayIndexException(String[] names) {
        try {
            int index = names.length;
            String name = names[index];
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + aioobe.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled generic RuntimeException: " + re.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            String[] names = new String[size];
            for (int i = 0; i < size; i++) {
                names[i] = sc.next();
            }

            System.out.println("Generating ArrayIndexOutOfBoundsException:");
            try {
                generateArrayIndexException(names);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Exception observed in main: " + aioobe);
            }

            System.out.println("\nHandling ArrayIndexOutOfBoundsException inside method:");
            handleArrayIndexException(names);
        }
    }
}
