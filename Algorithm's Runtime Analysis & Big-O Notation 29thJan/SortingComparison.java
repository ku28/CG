import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        Random random = new Random();
        
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(10000);
            }
            
            int[] bubbleArr = Arrays.copyOf(arr, arr.length);
            long startTime = System.nanoTime();
            bubbleSort(bubbleArr);
            long endTime = System.nanoTime();
            double bubbleTime = (endTime - startTime) / 1_000_000.0;
            
            int[] mergeArr = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            mergeSort(mergeArr, 0, mergeArr.length - 1);
            endTime = System.nanoTime();
            double mergeTime = (endTime - startTime) / 1_000_000.0;
            
            int[] quickArr = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            quickSort(quickArr, 0, quickArr.length - 1);
            endTime = System.nanoTime();
            double quickTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("Dataset Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime + " ms");
            System.out.println("Merge Sort Time: " + mergeTime + " ms");
            System.out.println("Quick Sort Time: " + quickTime + " ms");
            System.out.println();
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }
}
