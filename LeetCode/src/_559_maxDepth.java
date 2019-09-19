import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--08--12  18:07
 */
public class _559_maxDepth {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int max = 0;
        for (Node node : root.children) {
            int high = maxDepth(node);
            max = Math.max(high,max);
        }
        return max+1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
