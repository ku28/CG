import java.util.Scanner;

public class PriceCalc {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double pricePerItem = sc.nextDouble();
            int quantity = sc.nextInt();
            double totalPrice = pricePerItem * quantity;
            System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + pricePerItem);
        }
    }
}
