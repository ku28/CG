
import java.util.Scanner;

public class HikeTrail {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] heights = new int[n];
            for(int i=0; i<n; i++) heights[i] = sc.nextInt();
            int maxi = Integer.MIN_VALUE;
            for(int num : heights){
                maxi = Math.max(maxi, num);
            }
            System.out.println(maxi);
        }
    }
}
