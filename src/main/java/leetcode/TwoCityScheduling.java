package leetcode;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Problem statement:
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * https://leetcode.com/explore/featured/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/
 */
public class TwoCityScheduling {

    class PairComparator implements Comparator<Pair<Integer, Integer>> {

        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
            return p1.getKey() - p2.getKey();
        }
    }

    public int twoCitySchedCost(int[][] costs) {

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(costs.length, new PairComparator());

        for (int i = 0; i < costs.length; ++i) {
            pq.add(new Pair<Integer, Integer>(costs[i][0] - costs[i][1], i));
        }

        int costToTravelCityA = 0;
        int costToTravelCityB = 0;

        int peopleCountForA = 0;

        while (!pq.isEmpty() && 2 * peopleCountForA != costs.length) {
            int index = pq.poll().getValue();

            costToTravelCityA += costs[index][0];
            peopleCountForA++;
        }

        while (!pq.isEmpty() && peopleCountForA != costs.length) {
            int index = pq.poll().getValue();

            costToTravelCityB += costs[index][1];
            peopleCountForA++;
        }

        return costToTravelCityA + costToTravelCityB;

    }
}
