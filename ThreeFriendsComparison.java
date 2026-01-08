import java.util.Scanner;

public class ThreeFriendsComparison {
    
    public static int findYoungestIndex(int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        
        return youngestIndex;
    }
    
    public static int findTallestIndex(double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        
        return tallestIndex;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];
            
            for (int i = 0; i < 3; i++) {
                ages[i] = sc.nextInt();
                heights[i] = sc.nextDouble();
            }
            
            int youngestIndex = findYoungestIndex(ages);
            int tallestIndex = findTallestIndex(heights);
            
            System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
            System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        }
    }
}
