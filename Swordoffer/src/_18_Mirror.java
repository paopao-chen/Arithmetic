
/**
 * @author Politeness Chen
 * @create 2019--08--04  20:08
 */
public class _18_Mirror {
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode tree = root.left;
            root.left = root.right;
            root.right = tree;

            Mirror(root.left);
            Mirror(root.right);
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
