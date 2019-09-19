import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--08--01  15:54
 */
public class _03_printListFromTailToHead {
/*
    public static void printListInverselyUsingIteration(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
*/

    /**
     * 直接使用栈解决
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
