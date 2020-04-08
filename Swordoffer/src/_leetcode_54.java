/**
 * @author Politeness Chen
 * @create 2020--04--08  21:29
 *
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */
// 二叉搜索树，左边小右边大 如果是普通的数首先想到层序遍历然后排序找倒数第N个，而二叉搜索树用中序遍历就是有序的
public class _leetcode_54 {
    int count, res;
    public int kthLargest(TreeNode root, int k) {
        if (root == null || k < 0) return 0;
        dfs(root, k);
        return res;
    }

    private void dfs(TreeNode node, int k) {
        if (node == null) return;
        dfs(node.right, k);
        count ++;
        if (k == count){
            res = node.val;
        }
        dfs(node.left, k);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) {
            x = val;
        }
    }
}
