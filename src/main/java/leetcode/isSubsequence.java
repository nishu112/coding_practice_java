package leetcode;

public class isSubsequence {

    private boolean isSubSequenceHelper(String s, String t, int i, int j) {
        if (i < 0) {
            return true;
        }
        if (j < 0) {
            return false;
        }

        if (s.charAt(i) == t.charAt(j)) {
            return isSubSequenceHelper(s, t, i - 1, j - 1);
        }

        return isSubSequenceHelper(s, t, i, j - 1);
    }

    public boolean isSubsequence(String s, String t) {

        return isSubSequenceHelper(s, t, s.length() - 1, t.length() - 1);

    }
}
