
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    secondMax = max;
                    max = arr[i];
                } else if(arr[i]>secondMax && arr[i]!=max){
                    secondMax = arr[i];
                }
            }
            if(secondMax == Integer.MIN_VALUE){
                System.out.println("No Second Largest Element");
            } else {
                System.out.println(secondMax);
            }
        }
    }
}
