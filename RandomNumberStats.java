
public class RandomNumberStats {
    
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return randomNumbers;
    }
    
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) {
            sum += number;
            min = (int) Math.min(min, number);
            max = (int) Math.max(max, number);
        }
        
        double average = sum / numbers.length;
        
        return new double[] {average, min, max};
    }
    
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        double[] stats = findAverageMinMax(randomNumbers);
        
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int) stats[1]);
        System.out.println("Maximum: " + (int) stats[2]);
    }
}
