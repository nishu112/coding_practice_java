package leetcode_test;

import leetcode.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArray_test {

    private RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    @Test
    public void GIVEN_ARRAY_WITH_DUPLICATE_SHOULD_RETURN_NON_DUPLICATE_COUNT() {

        int[] nums = { 1, 2,2, 3,3, 5 };

        Assertions.assertEquals(4,removeDuplicates.removeDuplicates(nums));

    }

    @Test
    public void GIVEN__ARRAY_WITH_NO_REPITION_SHOULD_RETURN_SAME_ARRAY_COUNT(){

        int[] nums = { 1, 2,3, 5 };

        Assertions.assertEquals(4,removeDuplicates.removeDuplicates(nums));
    }

    @Test
    void GIVEN_EMPTY_ARRAY_SHOULD_RETURN_ZERO(){
        int[] nums = {};

        Assertions.assertEquals(0,removeDuplicates.removeDuplicates(nums));
    }

    @Test
    void GIVEN_SINGLE_ELEMENT_IN_ARRAY_SHOULD_RETURN_ONE(){
        int[] nums = {4};

        Assertions.assertEquals(1,removeDuplicates.removeDuplicates(nums));

    }


}

