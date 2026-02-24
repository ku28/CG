import java.util.Scanner;

public class BalancedSplitCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int sum = 0;
            for (int i : arr) sum += i;
            if (sum % 2 != 0) {
                System.out.println("Not Balanced");
                return;
            }
            int target = sum / 2;
            boolean found = false;
            int currentSum = 0;
            for (int i = 0; i < n; i++) {
                currentSum += arr[i];
                if (currentSum == target) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Balanced" : "Not Balanced");
        }
    }
}
