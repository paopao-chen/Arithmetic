import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Politeness Chen
 * @create 2019--08--17  21:39
 */
public class _22_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode t = queue.remove();
                list.add(t.val);
                if (t.left!=null)
                    queue.add(root.left);
                if (t.right!=null)
                    queue.add(root.right);
            }
        }
        return list;
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
