/**
 * @author Politeness Chen
 * @create 2019--06--25  21:19
 */
public class _83_deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
