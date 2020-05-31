package leetcode_test;

import leetcode.MaximumDepthOfBinaryTreeSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeSolution_test {

    private MaximumDepthOfBinaryTreeSolution maximumDepthOfBinaryTreeSolution = new MaximumDepthOfBinaryTreeSolution();

    @Test
    public void GIVEN_NULL_TREE_NODE_SHOULD_RETURN_ZERO() {
        MaximumDepthOfBinaryTreeSolution.TreeNode node = null;

        Assertions.assertEquals(0, maximumDepthOfBinaryTreeSolution.maxDepth(node));
    }

    @Test
    public void GIVEN_TREE_NODE_SAMPLE1(){
        MaximumDepthOfBinaryTreeSolution.TreeNode node2 = maximumDepthOfBinaryTreeSolution.new TreeNode(15);
        MaximumDepthOfBinaryTreeSolution.TreeNode node1 = maximumDepthOfBinaryTreeSolution.new TreeNode(15,node2,null);

        MaximumDepthOfBinaryTreeSolution.TreeNode node3 = maximumDepthOfBinaryTreeSolution.new TreeNode(15,node1,null);
        MaximumDepthOfBinaryTreeSolution.TreeNode node = maximumDepthOfBinaryTreeSolution.new TreeNode(15,node3,null);

        Assertions.assertEquals(4, maximumDepthOfBinaryTreeSolution.maxDepth(node));
    }


    @Test
    public void GIVEN_TREE_NODE_SAMPLE2(){
        MaximumDepthOfBinaryTreeSolution.TreeNode node2 = maximumDepthOfBinaryTreeSolution.new TreeNode(15);
        MaximumDepthOfBinaryTreeSolution.TreeNode node1 = maximumDepthOfBinaryTreeSolution.new TreeNode(15,null,null);

        MaximumDepthOfBinaryTreeSolution.TreeNode node3 = maximumDepthOfBinaryTreeSolution.new TreeNode(15,node1,node2);
        MaximumDepthOfBinaryTreeSolution.TreeNode node = maximumDepthOfBinaryTreeSolution.new TreeNode(15,node3,null);

        Assertions.assertEquals(3, maximumDepthOfBinaryTreeSolution.maxDepth(node));
    }
}
