import data_structures.TreeNode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if(root.left == null){
            return rightDepth + 1;
        }

        if(root.right == null){
            return leftDepth + 1;
        }

        int min = Math.min(leftDepth, rightDepth) + 1;
        return min;
    }
}
