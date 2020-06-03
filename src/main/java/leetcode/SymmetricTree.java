package leetcode;

/**
 * Problem Statement.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/627/
 */
public class SymmetricTree {

    public class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean symetricHelper(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 != null || root1 != null && root2 == null) {
            return false;
        }

        if (root1 == null) {
            return true;
        }

        return (root1.val == root2.val) &&
                symetricHelper(root1.left, root2.right) &&
                symetricHelper(root1.right, root2.left);

    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return symetricHelper(root.left, root.right);

    }

}
