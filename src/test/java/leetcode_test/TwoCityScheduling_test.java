package leetcode_test;

import leetcode.TwoCityScheduling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoCityScheduling_test {

    private TwoCityScheduling twoCityScheduling = new TwoCityScheduling();

    @Test
    public void GIVEN_CITIES_COST_FIND_MIN_SAMPLE1() {

        int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };

        Assertions.assertEquals(110, twoCityScheduling.twoCitySchedCost(costs));

    }

    @Test
    public void GIVEN_CITIES_COST_FIND_MIN_SAMPLE2() {

        int[][] costs = { { 10, 70 }, { 90, 80 }, { 40, 100 }, { 100, 150 } };

        Assertions.assertEquals(280, twoCityScheduling.twoCitySchedCost(costs));

    }

    @Test
    public void GIVEN_CITIES_COST_FIND_MIN_SAMPLE3() {

        int[][] costs = { { 10, 80 }, { 15, 100 }, { 20, 120 }, { 40, 130 } };

        Assertions.assertEquals(240, twoCityScheduling.twoCitySchedCost(costs));

    }

    @Test
    public void GIVEN_CITIES_COST_FIND_MIN_SAMPLE4() {

        int[][] costs = { { 80, 10 }, { 100, 15 }, { 120, 20 }, { 130, 40 } };

        Assertions.assertEquals(240, twoCityScheduling.twoCitySchedCost(costs));

    }
}
