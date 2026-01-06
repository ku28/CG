public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

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
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transposedMatrix = transpose(matrix);

        for (int[] transposedMatrix1 : transposedMatrix) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
