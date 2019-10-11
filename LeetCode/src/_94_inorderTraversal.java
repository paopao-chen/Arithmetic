import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--10--11  21:32
 */
public class _94_inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                list.add(node.val);
                root = node.right;
            }
        }
        return list;
    }

    class TreeNode{
        TreeNode left;
        TreeNode right;

        int val;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
