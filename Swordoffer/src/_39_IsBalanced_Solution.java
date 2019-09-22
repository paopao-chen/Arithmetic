/**
 * @author Politeness Chen
 * @create 2019--08--06  9:18
 */
public class _39_IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        return Math.abs(TreeDepth(root.left)-TreeDepth(root.right)) <=1 &&
                IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left,right)+1;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

}
