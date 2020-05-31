package leetcode;

public class ValidateBinarySearchTree {

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

    private boolean helperValidBst(TreeNode node, long leftLimit, long rightLimit) {
        if (node == null) {
            return true;
        }

        return (node.val < rightLimit && node.val > leftLimit) &&
                helperValidBst(node.left, leftLimit, node.val) &&
                helperValidBst(node.right, node.val, rightLimit);
    }

    public boolean isValidBST(TreeNode root) {

        return helperValidBst(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }
}
