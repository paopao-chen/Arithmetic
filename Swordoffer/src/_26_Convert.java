import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--09--24  15:54
 *
 * 将二叉搜索树转换成一个排序的双向链表
 */
public class _26_Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = pRootOfTree;
        TreeNode pre = null;
        boolean isFirst = true;
        while (root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (isFirst) {
                pRootOfTree = root; //中序遍历的第一个节点赋值
                pre = root;
                isFirst = false;
            } else {
                pre.right = root;
                root.left = pre;
                pre = root;
            }
            root = root.right;
        }
        return pRootOfTree;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
