public class DiscountFee {
    public static void main(String[] args) {
        double originalFee = 125000.0;
        double discountPercentage = 10.0;

        double discountAmount = (discountPercentage / 100) * originalFee;
        double discountedFee = originalFee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and the discounted fee is INR " + discountedFee);
    }
}
