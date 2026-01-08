public class MatrixManipulationSuite {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // 0-9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < common; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

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

    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(int[][] m) {
        double a = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        double b = m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        double c = m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return a - b + c;
    }

    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            return new double[0][0];
        }
        double factor = 1.0 / det;
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] * factor;
        inv[0][1] = -matrix[0][1] * factor;
        inv[1][0] = -matrix[1][0] * factor;
        inv[1][1] = matrix[0][0] * factor;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            return new double[0][0];
        }

        double[][] cof = new double[3][3];

        cof[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        cof[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        cof[0][2] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        cof[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        cof[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        cof[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        cof[2][0] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        cof[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        cof[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        // Adjugate is transpose of cofactor matrix
        double[][] adj = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adj[i][j] = cof[j][i];
            }
        }

        double[][] inv = new double[3][3];
        double factor = 1.0 / det;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adj[i][j] * factor;
            }
        }
        return inv;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = createRandomMatrix(3, 3);
        int[][] b = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Matrix B:");
        printMatrix(b);

        System.out.println("A + B:");
        printMatrix(addMatrices(a, b));

        System.out.println("A - B:");
        printMatrix(subtractMatrices(a, b));

        System.out.println("A * B:");
        printMatrix(multiplyMatrices(a, b));

        System.out.println("Transpose of A:");
        printMatrix(transpose(a));

        int[][] twoByTwo = createRandomMatrix(2, 2);
        System.out.println("2x2 matrix:");
        printMatrix(twoByTwo);
        double det2 = determinant2x2(twoByTwo);
        System.out.println("Determinant (2x2): " + det2);
        double[][] inv2 = inverse2x2(twoByTwo);
        if (inv2.length == 0) {
            System.out.println("Inverse (2x2): Not defined (determinant is zero)");
        } else {
            System.out.println("Inverse (2x2):");
            printMatrix(inv2);
        }

        System.out.println("Determinant (3x3) of A:");
        double det3 = determinant3x3(a);
        System.out.println(det3);
        double[][] inv3 = inverse3x3(a);
        if (inv3.length == 0) {
            System.out.println("Inverse (3x3) of A: Not defined (determinant is zero)");
        } else {
            System.out.println("Inverse (3x3) of A:");
            printMatrix(inv3);
        }
    }
}
