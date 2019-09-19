import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--05  21:48
 */
public class _38_TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = TreeDepth(root.left);
        System.out.println(left+"-------");
        int right = TreeDepth(root.right);
        return Math.max(left,right) + 1;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    @Test
    public void t(){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = null;
        System.out.println(TreeDepth(tree));
    }
}
