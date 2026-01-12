public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8};
        int xor = 0;
        int n = nums.length + 1;
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }
        System.out.println("Missing number is: " + xor);
    }
}
