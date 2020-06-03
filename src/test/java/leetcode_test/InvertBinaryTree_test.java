package leetcode_test;

import leetcode.InvertBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvertBinaryTree_test {

    private InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void GIVEN_NULL_ROOT_SHOULD_DONE_NOTHING() {
        InvertBinaryTree.TreeNode root = null;
        Assertions.assertEquals(null, invertBinaryTree.invertTree(root));
    }

    @Test
    public void GIVEN_TREE_WITH_ONE_NODE_SHOULD_DO_NOTHING() {
        InvertBinaryTree.TreeNode root = invertBinaryTree.new TreeNode(20);

        InvertBinaryTree.TreeNode expected = invertBinaryTree.new TreeNode(20);
        Assertions.assertEquals(expected, invertBinaryTree.invertTree(root));
    }

    @Test
    public void GIVEN_TREE_SAMPLE1() {

        /*
                 4
               /   \
              2     7
             / \   / \
            1   3 6   9
         */
        InvertBinaryTree.TreeNode node3 = invertBinaryTree.new TreeNode(1);
        InvertBinaryTree.TreeNode node4 = invertBinaryTree.new TreeNode(3);
        InvertBinaryTree.TreeNode node5 = invertBinaryTree.new TreeNode(6);
        InvertBinaryTree.TreeNode node6 = invertBinaryTree.new TreeNode(9);

        InvertBinaryTree.TreeNode node1 = invertBinaryTree.new TreeNode(2, node3, node4);
        InvertBinaryTree.TreeNode node2 = invertBinaryTree.new TreeNode(7, node5, node6);

        InvertBinaryTree.TreeNode root = invertBinaryTree.new TreeNode(4, node1, node2);

        //Create Expected tree

        InvertBinaryTree.TreeNode expectedNode3 = invertBinaryTree.new TreeNode(9);
        InvertBinaryTree.TreeNode expectedNode4 = invertBinaryTree.new TreeNode(6);
        InvertBinaryTree.TreeNode expectedNode5 = invertBinaryTree.new TreeNode(3);
        InvertBinaryTree.TreeNode expectedNode6 = invertBinaryTree.new TreeNode(1);

        InvertBinaryTree.TreeNode expectedNode1 = invertBinaryTree.new TreeNode(7, expectedNode3, expectedNode4);
        InvertBinaryTree.TreeNode expectedNode2 = invertBinaryTree.new TreeNode(2, expectedNode5, expectedNode6);

        InvertBinaryTree.TreeNode expectedRoot = invertBinaryTree.new TreeNode(4, expectedNode1, expectedNode2);


        InvertBinaryTree.TreeNode expected = invertBinaryTree.new TreeNode(20);
        Assertions.assertEquals(expected, invertBinaryTree.invertTree(root));
    }

}
