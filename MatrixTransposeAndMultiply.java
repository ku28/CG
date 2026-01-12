public class MatrixTransposeAndMultiply {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transposedMatrix = transpose(matrix);
        System.out.println("Transposed Matrix:");
        for (int[] transposedMatrix1 : transposedMatrix) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix1[j] + " ");
            }
            System.out.println();
        }
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        int[][] multipliedMatrix = multiply(matrixA, matrixB);
        System.out.println("Multiplied Matrix:");
        for (int[] multipliedMatrix1 : multipliedMatrix) {
            for (int j = 0; j < multipliedMatrix[0].length; j++) {
                System.out.print(multipliedMatrix1[j] + " ");
            }
            System.out.println();
        }
    }
}