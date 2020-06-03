package leetcode;

/**
 * Problem Statement:
 * Invert a binary tree.
 * https://leetcode.com/explore/featured/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3347/
 *
 * Submitted without testing with test cases!.
 * It might have broken! never do that
 */
public class InvertBinaryTree {

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

    private TreeNode invertTreeHelper(TreeNode node) {

        if (node == null || node.left == null && node.right == null) {
            return node;
        }

        TreeNode left = invertTree(node.left);
        TreeNode right = invertTree(node.right);

        node.right = left;
        node.left = right;
        return node;

    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        return invertTreeHelper(root);
    }

}
