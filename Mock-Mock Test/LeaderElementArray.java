import java.util.Scanner;

public class LeaderElementArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                boolean isLeader = true;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        isLeader = false;
                        break;
                    }
                }
                if (isLeader) System.out.print(arr[i] + " ");
            }
        }
    }
}
