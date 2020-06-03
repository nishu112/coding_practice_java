package leetcode_test;

import leetcode.SymmetricTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTree_test {

    private SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void GIVEN_NULL_ROOT_SHOULD_RETURN_TRUE() {

        SymmetricTree.TreeNode root = null;

        Assertions.assertEquals(true, symmetricTree.isSymmetric(root));
    }

    @Test
    public void GIVEN_SYMETTRIC_TREE_SHOULD_RETURN_TRUE() {
        /*
                1
               / \
              2   2
             / \ / \
            3  4 4  3

         */

        SymmetricTree.TreeNode node3 = symmetricTree.new TreeNode(3);
        SymmetricTree.TreeNode node4 = symmetricTree.new TreeNode(4);
        SymmetricTree.TreeNode node5 = symmetricTree.new TreeNode(4);
        SymmetricTree.TreeNode node6 = symmetricTree.new TreeNode(3);

        SymmetricTree.TreeNode node1 = symmetricTree.new TreeNode(2, node3, node4);
        SymmetricTree.TreeNode node2 = symmetricTree.new TreeNode(2, node5, node6);

        SymmetricTree.TreeNode root = symmetricTree.new TreeNode(10, node1, node2);

        Assertions.assertEquals(true, symmetricTree.isSymmetric(root));

    }

    @Test
    public void GIVEN_TREE_IS_NOT_SYMETTRIC_SHOULD_RETURN_FALSE() {
        /*
                1
               / \
              2   2
             / \ / \
            3  4 4  3

         */

        SymmetricTree.TreeNode node3 = symmetricTree.new TreeNode(3);

        SymmetricTree.TreeNode node4 = symmetricTree.new TreeNode(4);
        SymmetricTree.TreeNode node5 = symmetricTree.new TreeNode(4);

        SymmetricTree.TreeNode node1 = symmetricTree.new TreeNode(2, node3, node4);
        SymmetricTree.TreeNode node2 = symmetricTree.new TreeNode(2, node5, null);

        SymmetricTree.TreeNode root = symmetricTree.new TreeNode(10, node1, node2);

        Assertions.assertEquals(false, symmetricTree.isSymmetric(root));

    }

    @Test
    public void GIVEN_TREE_IS_NOT_SYMETTRIC_SAMPLE2() {
        /*
                1
               / \
              2   2
               \   \
               3    3

         */

        SymmetricTree.TreeNode node3 = symmetricTree.new TreeNode(3);

        SymmetricTree.TreeNode node4 = symmetricTree.new TreeNode(3);

        SymmetricTree.TreeNode node1 = symmetricTree.new TreeNode(2, null, node3);
        SymmetricTree.TreeNode node2 = symmetricTree.new TreeNode(2, null, node4);

        SymmetricTree.TreeNode root = symmetricTree.new TreeNode(10, node1, node2);

        Assertions.assertEquals(false, symmetricTree.isSymmetric(root));

    }
}
