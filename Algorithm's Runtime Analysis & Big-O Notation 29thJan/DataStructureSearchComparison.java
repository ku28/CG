import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        Random random = new Random();
        
        for (int size : sizes) {
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            
            for (int i = 0; i < size; i++) {
                int value = random.nextInt(size * 2);
                array[i] = value;
                hashSet.add(value);
                treeSet.add(value);
            }
            
            int target = array[size / 2];
            
            long startTime = System.nanoTime();
            arraySearch(array, target);
            long endTime = System.nanoTime();
            double arrayTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            hashSet.contains(target);
            endTime = System.nanoTime();
            double hashSetTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            treeSet.contains(target);
            endTime = System.nanoTime();
            double treeSetTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("Dataset Size: " + size);
            System.out.println("Array Search Time: " + arrayTime + " ms");
            System.out.println("HashSet Search Time: " + hashSetTime + " ms");
            System.out.println("TreeSet Search Time: " + treeSetTime + " ms");
            System.out.println();
        }
    }
    
    public static boolean arraySearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
