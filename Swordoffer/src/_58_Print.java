import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--09--01  16:20
 */
public class _58_Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        Stack<TreeNode> s1 = new Stack<>(); //奇数行  从右向左存，左往右取
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<>(); //偶数行  从左向右存，右往左取

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (layer % 2 == 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.isEmpty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {
                        temp.add(node.val);
                        System.out.println(node.val + " ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer ++;
                    System.out.println();
                }
            } else {  //奇数行
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.isEmpty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        temp.add(node.val);
                        System.out.println(node.val + " ");
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer ++;
                    System.out.println();
                }
            }
        }
        return list;
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
