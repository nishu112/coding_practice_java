package leetcode_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import leetcode.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArray_test {

    private RotateArray removeDuplicates = new RotateArray();
    private ObjectMapper OM = new ObjectMapper();

    @Test
    public void GIVEN_ARRAY_WITH_ROTATION_NUMBER_SAMPLE1() {

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int[] expectedNums = { 5, 6, 7, 1, 2, 3, 4 };

        removeDuplicates.rotate(nums, k);
        Assertions.assertTrue(Arrays.equals(expectedNums, nums));

    }

    @Test
    public void GIVEN_ARRAY_WITH_ROTATION_NUMBER_SAMPLE2() {

        int[] nums = { -1, -100, 3, 99 };
        int k = 2;
        int[] expectedNums = { 3, 99, -1, -100 };
        removeDuplicates.rotate(nums, k);
        Assertions.assertTrue(Arrays.equals(expectedNums, nums));

    }

    @Test
    public void GIVEN_ARRAY_WITH_K_EQUALS_SIZE_OF_ARRAY_SHOULD_RETURN_SAME_ARRAY(){
        int[] nums = { -1, -100, 3, 99 };
        int k = 4;
        int[] expectedNums = {  -1, -100, 3, 99 };
        removeDuplicates.rotate(nums, k);
        Assertions.assertTrue(Arrays.equals(expectedNums, nums));

    }

}

