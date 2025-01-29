import data_structures.TreeNode;

public class CountGoodNodes {
    int goodNodes(TreeNode root) {
        return helper(root, root.val);
    }
    private static int helper(TreeNode node, int maxVal){
        if (node == null) return 0;

        int goodNodes = 0;

        if(node.val >= maxVal){
            goodNodes = 1;
        }

        maxVal = Math.max(maxVal, node.val);

        goodNodes += helper(node.left, maxVal);
        goodNodes += helper(node.right, maxVal);
        return goodNodes;
    }
}
