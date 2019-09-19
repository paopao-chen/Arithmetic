import java.util.LinkedList;

/**
 * @author Politeness Chen
 * @create 2019--08--14  20:11
 */
public class _112_hasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum -= root.val;
        if (root.left == null && root.right == null)
            return sum==0;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);

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
