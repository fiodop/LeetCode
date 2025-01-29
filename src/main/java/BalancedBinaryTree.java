import data_structures.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        return helper(root) != - 1;

    }
    private int helper(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftDepth = helper(node.left);
        if(leftDepth == -1) return -1;

        int rightDepth = helper(node.right);
        if(rightDepth == -1) return -1;

        if(Math.abs(leftDepth - rightDepth) > 1){
            return -1;
        }

        return Math.max(rightDepth, leftDepth) + 1;
    }
}
