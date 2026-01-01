import java.util.Scanner;

public class DiscountFeeInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double originalFee = sc.nextDouble();
            double discountPercentage = sc.nextDouble();
            
            double discountAmount = (discountPercentage / 100) * originalFee;
            double discountedFee = originalFee - discountAmount;
            
            System.out.println("The discount amount is INR " + discountAmount + " and the discounted fee is INR " + discountedFee);
        }
    }
}