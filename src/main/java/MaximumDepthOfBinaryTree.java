import data_structures.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int cntRigthNode = maxDepth(root.right);
        int cntLeftNode = maxDepth(root.left);
        int maxDepth = Math.max(cntLeftNode + 1, cntRigthNode + 1);
        return maxDepth;
    }
}
