import java.util.Scanner;

public class OddIndexStability {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n > 2) {
                int lastEvenIndex = (n % 2 == 1) ? (n - 1) : (n - 2);
                int lastEvenValue = arr[lastEvenIndex];
                for (int i = lastEvenIndex; i >= 2; i -= 2) {
                    arr[i] = arr[i - 2];
                }
                arr[0] = lastEvenValue;
            }

            for (int i : arr) System.out.print(i + " ");
        }
    }
}
