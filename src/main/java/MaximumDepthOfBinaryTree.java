import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    public  int maxDepth(TreeNode root) {
            return maxDepthCnt(root, 0);


    }
    public int maxDepthCnt(TreeNode node, int cnt){
        if(node == null){
            return cnt;
        } else {
            int leftNodeCnt = maxDepthCnt(node.left, cnt++);
            int rightNodeCnt = maxDepthCnt(node.right, cnt++);
            return Math.max(leftNodeCnt, rightNodeCnt) + 1;

        }}
}
