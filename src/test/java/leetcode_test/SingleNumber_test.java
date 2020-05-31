package leetcode_test;

import leetcode.SingleNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumber_test {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void GIVEN_ARRAY_WITH_ONLY_ONE_SINGLE_ELEMENT(){
        int[] nums = {1,3,4,1,4};

        Assertions.assertEquals(3,singleNumber.singleNumber(nums));
    }

}
