package leetcode;

/**
 * problem statement
 *
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 *
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int profit = 0;
        int n = prices.length;

        for (int i = 1; i < n; ++i) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;

    }
}
