public class AddOneToDigits {
    public static int[] addOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {7, 8, 4};
        int[] result = addOne(digits);

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
