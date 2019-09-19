/**
 * @author Politeness Chen
 * @create 2019--08--09  20:33
 */
public class _57_isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        return isMirr(pRoot,pRoot);
    }

    boolean isMirr (TreeNode p1, TreeNode p2) {
        if (p1 == null && p2 == null) {
            return true;
        }
        if (p1 == null || p2 == null) {
            return false;
        }
        return (p1.val == p2.val) && isMirr(p1.left,p2.right) && isMirr(p1.right,p2.left);
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
