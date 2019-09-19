/**
 * @author Politeness Chen
 * @create 2019--09--18  20:33
 *
 * 判断树B是不是树A的子结构
 */
public class _17_HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return isSameTree(root1, root2) ||
                HasSubtree(root1.left, root2) ||
                HasSubtree(root1.right, root2);
    }

    private boolean isSameTree(TreeNode root1,TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root2.val == root1.val) {
            return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
        } else {
            return false;
        }
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
