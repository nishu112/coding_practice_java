package leetcode_test;

import leetcode.RandomizedSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedSet_test {

    private RandomizedSet randomizedSet = new RandomizedSet();

    @Test
    public void GIVEN_RANDOMISEDSET_PERFORM_OPERATION_SAMPLE1() {

        /**
         * ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
         * [[],[1],[2],[2],[],[1],[2],[]]
         */

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomizedSet.remove(0);

        // Returns false as 2 does not exist in the set.
        randomizedSet.remove(0);

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        randomizedSet.insert(0);

        // getRandom should return either 1 or 2 randomly.
        randomizedSet.getRandom();

        // Removes 1 from the set, returns true. Set now contains [2].
        randomizedSet.remove(0);

        // 2 was already in the set, so return false.
        randomizedSet.insert(0);

        // Since 2 is the only number in the set, getRandom always return 2.

        Assertions.assertEquals(1, randomizedSet.arr.size());
        Assertions.assertEquals(0, randomizedSet.arr.get(0));
    }
}
