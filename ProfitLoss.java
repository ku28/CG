public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            int profitPercentage = (profit * 100) / costPrice;
            System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                                "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
        } else if (costPrice > sellingPrice) {
            int loss = costPrice - sellingPrice;
            System.out.println("The loss incurred is " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
