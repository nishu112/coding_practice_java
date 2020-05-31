package leetcode;

/**
 * Problem statement
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 1;
        int i = 0;
        while (j < nums.length) {

            if (nums[i] != nums[j]) {
                ++i;
                nums[i] = nums[j];
            }
            ++j;

        }

        return i + 1;
    }

}
