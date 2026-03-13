package leetcode.maxProfitBuySellStock_121;

public class MaxProfitBuySellStock {

    private static int maxProfit(int[] prices){

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            int current = price - min;
            maxProfit = Math.max(current, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
