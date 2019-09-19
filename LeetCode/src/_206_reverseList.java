/**
 * @author Politeness Chen
 * @create 2019--07--31  9:43
 */
public class _206_reverseList {
    public ListNode reverseList(ListNode head) {
        /*ListNode pre = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;*/

        //递归实现
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
