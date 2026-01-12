public class SumOfEven {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        System.out.println("Sum of even digits: " + sum);
    }
}
