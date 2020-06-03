package leetcode_test;

import leetcode.BinaryTreeLevelOrderTraversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_test {

    BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();


    @Test
    public void GIVEN_NULL_TREE_NODE_SHOULD_RETURN_EMPTY(){

        BinaryTreeLevelOrderTraversal.TreeNode root = null;

        Assertions.assertEquals(new ArrayList<List<Integer>>(),binaryTreeLevelOrderTraversal.levelOrder(root));
    }

    //TODO

}
