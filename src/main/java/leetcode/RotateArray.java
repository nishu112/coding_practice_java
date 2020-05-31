package leetcode;


/**
 * Problem statement
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Follow up:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/
 */
public class RotateArray {

    public void reverse(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        int temp;

        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }

    public void rotate(int[] nums, int k) {

        if (nums.length <= 1 || k % nums.length == 0) {
            return;
        }

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

}
