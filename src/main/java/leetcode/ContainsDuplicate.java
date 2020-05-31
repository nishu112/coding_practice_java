package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem statement
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/
 */

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> distinctElement = new HashSet<Integer>();

        for (int num : nums) {
            if (distinctElement.contains(num)) {
                return true;
            }
            distinctElement.add(num);
        }

        return false;
    }

}
