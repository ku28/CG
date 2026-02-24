import java.util.Scanner;

public class MaxDifferenceWithConstraint {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int maxDiff = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > arr[i]) {
                        maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
                    }
                }
            }
            if (maxDiff == Integer.MIN_VALUE) {
                System.out.print("-1 ");
            } else {
                System.out.print(maxDiff);
            }
        }
    }
}
