import java.io.*;

public class FileReadingComparison {
    public static void main(String[] args) {
        String fileName = "testfile.txt";
        int[] sizes = {1000, 10000, 100000};
        
        for (int size : sizes) {
            createTestFile(fileName, size);
            
            long startTime = System.nanoTime();
            readWithFileReader(fileName);
            long endTime = System.nanoTime();
            double fileReaderTime = (endTime - startTime) / 1_000_000.0;
            
            startTime = System.nanoTime();
            readWithInputStreamReader(fileName);
            endTime = System.nanoTime();
            double inputStreamReaderTime = (endTime - startTime) / 1_000_000.0;
            
            System.out.println("File Size: " + size + " lines");
            System.out.println("FileReader Time: " + fileReaderTime + " ms");
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
            System.out.println();
        }
        
        new File(fileName).delete();
    }
    
    public static void createTestFile(String fileName, int lines) {
        try {
            try (FileWriter writer = new FileWriter(fileName)) {
                for (int i = 0; i < lines; i++) {
                    writer.write("This is line " + i + " with some test data.\n");
                }
            }
        } catch (IOException e) {
        }
    }
    
    public static void readWithFileReader(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while (bufferedReader.readLine() != null) {
                }
            }
        } catch (IOException e) {
        }
    }
    
    public static void readWithInputStreamReader(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                while (bufferedReader.readLine() != null) {
                }
            }
        } catch (IOException e) {
        }
    }
}
