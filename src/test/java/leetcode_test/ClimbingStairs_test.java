package leetcode_test;

import leetcode.ClimbingStairs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairs_test {

    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    public void GIVEN_TRIVAL_CASE(){
        Assertions.assertEquals(0,climbingStairs.climbStairs(0));
        Assertions.assertEquals(1,climbingStairs.climbStairs(1));
        Assertions.assertEquals(2,climbingStairs.climbStairs(2));
        Assertions.assertEquals(3,climbingStairs.climbStairs(3));
        Assertions.assertEquals(5,climbingStairs.climbStairs(4));
        Assertions.assertEquals(8,climbingStairs.climbStairs(5));

    }
}
