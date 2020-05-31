package leetcode_test;

import leetcode.BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockII_test {

    private BestTimeToBuyAndSellStockII bestTime = new BestTimeToBuyAndSellStockII();

    @Test
    public void GIVEN_BUY_AND_SELL_PRICES_GET_MAX_PROFIT_SAMPLE1() {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        assertEquals(7, bestTime.maxProfit(prices));
    }

    @Test
    public void GIVEN_BUY_AND_SELL_PRICES_GET_MAX_PROFIT_SAMPLE2() {

        int[] prices = { 1, 2, 3, 4, 5 };
        assertEquals(4, bestTime.maxProfit(prices));

    }

    @Test
    public void GIVEN_BUY_AND_SELL_PRICES_GET_MAX_PROFIT_SAMPLE3() {

        int[] prices = { 7, 6, 4, 3, 1 };
        assertEquals(0, bestTime.maxProfit(prices));

    }

    @Test
    public void GIVEN_PRICES_WITH_INCREASING_ORDER_SAMPLE4() {
        int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(8, bestTime.maxProfit(prices));

    }

}
