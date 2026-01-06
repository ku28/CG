import java.util.Scanner;

public class MatrixTo1DArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = sc.nextInt();
            
            int[][] matrix = new int[rows][columns];
            
            System.out.println("Enter the matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            int[] array = new int[rows * columns];
            int index = 0;
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }
            
            System.out.println("\n2D Array (Matrix):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("\n1D Array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
