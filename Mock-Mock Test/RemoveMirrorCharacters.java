import java.util.Scanner;

public class RemoveMirrorCharacters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = str.length();
            if (n % 2 == 0) {
                String firstHalf = str.substring(0, n / 2);
                String secondHalf = str.substring(n / 2);
                if (firstHalf.equals(secondHalf)) {
                    System.out.println(firstHalf);
                } else {
                    System.out.println(str);
                }
            } else {
                System.out.println(str);
            }
        }
    }
}
