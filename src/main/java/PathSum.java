import data_structures.TreeNode;

public class PathSum {
    public boolean HasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        if(root.val == targetSum && root.right == null && root.left == null){
            return true;
        }
        int newTargetSum = targetSum - root.val;

        return HasPathSum(root.left, newTargetSum) || HasPathSum(root.right, newTargetSum);
    }
}
