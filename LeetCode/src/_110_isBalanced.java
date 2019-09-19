/**
 * @author Politeness Chen
 * @create 2019--08--14  20:28
 */
public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {   //一直在递归，要在每一次的时候都进行判断
        if (root == null)
            return 0;
        int left = depth(root.left);
        if (left == -1) return -1;
        int right = depth(root.right);
        if (right == -1) return -1;
        return Math.abs(left-right) < 2 ? Math.max(left,right)+1 : -1;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
