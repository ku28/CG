public class StringConcatenationComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        
        for (int size : sizes) {
            long startTime = System.nanoTime();
            stringConcatenation(size);
            long endTime = System.nanoTime();
            double stringTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            stringBuilderConcatenation(size);
            endTime = System.nanoTime();
            double builderTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            stringBufferConcatenation(size);
            endTime = System.nanoTime();
            double bufferTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("Operations Count: " + size);
            System.out.println("String Time: " + stringTime + " ms");
            System.out.println("StringBuilder Time: " + builderTime + " ms");
            System.out.println("StringBuffer Time: " + bufferTime + " ms");
            System.out.println();
        }
    }
    
    public static String stringConcatenation(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        return result;
    }
    
    public static String stringBuilderConcatenation(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }
    
    public static String stringBufferConcatenation(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }
}
