import java.util.Arrays;

public class SearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }
            
            int target = size - 1;
            
            long startTime = System.nanoTime();
            linearSearch(arr, target);
            long endTime = System.nanoTime();
            double linearTime = (endTime - startTime) / 1_000_000.0;
            
            Arrays.sort(arr);
            startTime = System.nanoTime();
            binarySearch(arr, target);
            endTime = System.nanoTime();
            double binaryTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + linearTime + " ms");
            System.out.println("Binary Search Time: " + binaryTime + " ms");
            System.out.println();
        }
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
