public class RotateArrayLeftRight {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arrLeft = {1, 2, 3, 4, 5, 6, 7};
        int dLeft = 2;
        rotateLeft(arrLeft, dLeft);
        System.out.print("Array after left rotation by " + dLeft + ": ");
        for (int num : arrLeft) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arrRight = {1, 2, 3, 4, 5, 6, 7};
        int dRight = 3;
        rotateRight(arrRight, dRight);
        System.out.print("Array after right rotation by " + dRight + ": ");
        for (int num : arrRight) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
