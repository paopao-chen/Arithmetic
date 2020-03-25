import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2020--03--25  20:15
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 从尾到头首先要想到用 栈 去做
 */
public class _leetcode_06 {
    public int[] reversePrint(ListNode head) {
        Stack stack = new Stack();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int len = stack.size();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
           arr[i] = (int) stack.pop();
        }
        return arr;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
