import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Politeness Chen
 * @create 2019--06--27  20:29
 */
public class _104_maxDepth {
    public int maxDepth(TreeNode root) {
        /*if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right) + 1;
        }*/
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                   queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count --;
            }
            sum ++;
        }
        return sum;


        //非递归实现 借助队列 采用两个变量记录层的节点数
        /*if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int pre = 1;
        int p = 0;
        int level = 0;

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            pre --;

            if (temp.left != null) {
                q.offer(temp.left);
                p ++;
            }
            if (temp.right != null) {
                q.offer(temp.right);
                p ++;
            }

            if (pre == 0) {
                pre = p;
                p = 0;
                level ++;
            }
        }
        return level;*/
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
