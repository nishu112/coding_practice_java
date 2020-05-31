package leetcode_test;

import leetcode.ValidateBinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Number of count code broken in prod:2
 */
public class ValidateBinarySearchTree_test {

    private ValidateBinarySearchTree validate = new ValidateBinarySearchTree();

    @Test
    public void GIVEN_NULL_ROOT_SHOULD_RETURN_TRUE() {
        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(30);
        Assertions.assertEquals(true, validate.isValidBST(root));
    }

    /**
     * Node have the IntMax value so it got failed.
     * Edge case!
     * Update:- so i have take Long max value to compare the cases.
     */
    @Test
    public void GIVEN_NULL_ROOT_SHOULD_RETURN_TRUE_PROD_FAILURE_CASE() {
        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(2147483647);
        Assertions.assertEquals(true, validate.isValidBST(root));
    }




    @Test
    public void GIVEN_BST_SHOULD_RETURN_TRUE() {

         /*
                10
              /     \
              6     15
           /    \   /
           4    7   11

         */

        ValidateBinarySearchTree.TreeNode node3 = validate.new TreeNode(4);
        ValidateBinarySearchTree.TreeNode node5 = validate.new TreeNode(11);
        ValidateBinarySearchTree.TreeNode node4 = validate.new TreeNode(7, null, null);
        ValidateBinarySearchTree.TreeNode node1 = validate.new TreeNode(6, node3, node4);
        ValidateBinarySearchTree.TreeNode node2 = validate.new TreeNode(15, node5, null);

        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(10, node1, node2);

        Assertions.assertEquals(true, validate.isValidBST(root));

    }

    @Test
    public void GIVEN_TREE_IS_NOT_BST_SHOULD_RETURN_FALSE() {

        /*

                10
              /     \
             6      15
           /    \
           4     7
                  \
                   11
         */

        ValidateBinarySearchTree.TreeNode node3 = validate.new TreeNode(4);
        ValidateBinarySearchTree.TreeNode node5 = validate.new TreeNode(11);
        ValidateBinarySearchTree.TreeNode node4 = validate.new TreeNode(7, null, node5);
        ValidateBinarySearchTree.TreeNode node1 = validate.new TreeNode(6, node3, node4);
        ValidateBinarySearchTree.TreeNode node2 = validate.new TreeNode(15);

        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(10, node1, node2);

        Assertions.assertEquals(false, validate.isValidBST(root));

    }

    @Test
    public void GIVEN_BST_SAMPLE1() {
        ValidateBinarySearchTree.TreeNode node1 = validate.new TreeNode(1);
        ValidateBinarySearchTree.TreeNode node2 = validate.new TreeNode(3);

        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(2, node1, node2);
        Assertions.assertEquals(true, validate.isValidBST(root));

    }

    @Test
    public void GIVEN_TREE_IS_NOT_BST_SAMPLE2() {
        /*

            5
           / \
          1   4
             / \
            3   6
         */
        ValidateBinarySearchTree.TreeNode node1 = validate.new TreeNode(1);
        ValidateBinarySearchTree.TreeNode node3 = validate.new TreeNode(4);
        ValidateBinarySearchTree.TreeNode node4 = validate.new TreeNode(3);
        ValidateBinarySearchTree.TreeNode node2 = validate.new TreeNode(6, node3, node4);

        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(5, node1, node2);
        Assertions.assertEquals(false, validate.isValidBST(root));

    }

    //Forgot this case!.
    @Test
    public void GIVEN_TREE_WITH_EQUAL_NODE_VALUES() {

        ValidateBinarySearchTree.TreeNode node1 = validate.new TreeNode(1);

        ValidateBinarySearchTree.TreeNode root = validate.new TreeNode(1, node1, null);
        Assertions.assertEquals(false, validate.isValidBST(root));

    }

}
