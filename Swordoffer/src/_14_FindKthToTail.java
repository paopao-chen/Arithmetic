/**
 * @author Politeness Chen
 * @create 2019--08--03  20:43
 */
public class _14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k < 1 || head == null) {
            return null;
        }
        ListNode cur = head;
        //走K-1步正好有K个节点
        for (int i = 0; i < k-1; i++) {
            if (cur.next != null)
                cur = cur.next;
            else
                return null;
        }

        while (cur.next != null) {
            head = head.next;
            cur = cur.next;
        }
        return head;
    }

    public static class ListNode {
        int value;
        ListNode next;
    }
}
