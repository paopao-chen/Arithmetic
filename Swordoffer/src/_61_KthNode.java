import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--09--24  16:52
 *
 * 二叉搜索树，请找出其中的第k小的结点
 */
public class _61_KthNode {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        int count = 0;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                count ++;
                if (count == k) {
                    return node;
                }
                node = node.right;
            }
        }
        return null;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
