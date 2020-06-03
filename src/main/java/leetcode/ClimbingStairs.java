package leetcode;

/**
 * Problem statement:
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/569/
 */
public class ClimbingStairs {

    public int climbStairs(int n) {

        if (n < 0) {
            throw new IllegalStateException("Numbers should not be negative.");
        }

        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int temp;
        n -= 2;
        while (n-- > 0) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;

    }
}
