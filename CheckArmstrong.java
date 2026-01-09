import java.util.Scanner;

public class CheckArmstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            if (isArmstrong(input)) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not Armstrong Number");
            }
        }
    }
}
