package leetcode_test;

import leetcode.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate_test {

    private ContainsDuplicate duplicate = new ContainsDuplicate();

    @Test
    public void GIVEN_ARRAY_WITH_DUPLICATE_SHOULD_RETURN_TRUE() {
        int[] nums = {1,2,4,6,1};

        Assertions.assertEquals(true,duplicate.containsDuplicate(nums));

    }

    @Test
    public void GIVEN_ARRAY_WITHOUT_DUPLICATE_SHOULD_RETURN_FALSE() {


        int[] nums = {1,2,4,6};

        Assertions.assertEquals(false,duplicate.containsDuplicate(nums));
    }
}
