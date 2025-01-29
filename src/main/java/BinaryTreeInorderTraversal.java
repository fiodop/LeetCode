import data_structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answ = new ArrayList<>();
        helper(root, answ);
        return answ;
    }
    private void helper(TreeNode node, List<Integer> answ){
        if(node == null){
            return;
        }

        helper(node.left, answ);
        answ.add(node.val);
        helper(node.right, answ);
    }

}
/**
 *     1
 *    / \
 *   2   3
 *  / \
 * 4   5
 */