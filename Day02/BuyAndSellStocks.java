
public class BuyAndSellStocks {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // 1. Test data (array) banaya
        int[] test = {7, 1, 5, 3, 6, 4};

        // 2. Apni class ka ek Object banaya (taaki uske andar ki machine use kar sakein)
        BuyAndSellStocks obj = new BuyAndSellStocks();

        // 3. Method ko call kiya aur result ek variable mein save kiya
        int finalProfit = obj.maxProfit(test);

        // 4. System.out ka use karke console par result print kiya
        System.out.println("Maximum Profit: " + finalProfit);
        // Output dikhega -> Maximum Profit: 5
    }
}
