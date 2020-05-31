package leetcode;

/**
 * Problem statement
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/
 *
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {

        if ((nums.length & 1) == 0) {
            throw new IllegalStateException();
        }

        int singleNumber = 0;

        for (int i = 0; i < nums.length; ++i) {
            singleNumber ^= nums[i];
        }

        return singleNumber;
    }
}
