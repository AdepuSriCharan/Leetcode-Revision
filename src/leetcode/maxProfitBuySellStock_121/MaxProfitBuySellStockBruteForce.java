package leetcode.maxProfitBuySellStock_121;

public class MaxProfitBuySellStockBruteForce {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int current;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                current = prices[j] - prices[i];
                maxProfit = Math.max(current, maxProfit);
            }
        }
        return maxProfit;
    }
}
