import java.util.ArrayList;

/**
 * @author Politeness Chen
 * @create 2019--09--10  16:48
 */
public class _24_FindPath {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return result;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return result;
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
}
