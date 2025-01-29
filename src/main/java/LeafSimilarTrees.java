import data_structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> root1Leafes = new ArrayList<>();
        ArrayList<Integer> root2Leafes = new ArrayList<>();

        return root1Leafes.equals(root2Leafes);
    }
    public void getLeafs(TreeNode node, List<Integer> leafValues){
        ArrayList<ListNode> leafs = new ArrayList<>();
        if(node == null){
            return;
        }
        if(node.right == null && node.left == null){
            leafValues.add(node.val);
        }

        getLeafs(node.left, leafValues);
        getLeafs(node.right, leafValues);
    }
}
