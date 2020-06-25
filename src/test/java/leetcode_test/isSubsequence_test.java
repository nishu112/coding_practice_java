package leetcode_test;

import leetcode.isSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isSubsequence_test {

    private isSubsequence isSubsequence = new isSubsequence();

    @Test
    public void GIVEN_SAMPLE1() {

        String s = "abc";
        String t = "ahbgdc";

        Assertions.assertEquals(true, isSubsequence.isSubsequence(s, t));

    }

    @Test
    public void GIVEN_SAMPLE2() {

        String s = "axc";
        String t = "ahbgdc";

        Assertions.assertEquals(false, isSubsequence.isSubsequence(s, t));

    }

    @Test
    public void GIVEN_SAMPLE3() {

        String s = "axc";
        String t = "axc";

        Assertions.assertEquals(true, isSubsequence.isSubsequence(s, t));

    }

    @Test
    public void GIVEN_SAMPLE4() {

        String s = "aaa";
        String t = "aa";

        Assertions.assertEquals(false, isSubsequence.isSubsequence(s, t));

    }
}
