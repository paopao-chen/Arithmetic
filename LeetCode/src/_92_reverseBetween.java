/**
 * @author Politeness Chen
 * @create 2019--09--27  20:40
 *
 * 反转从位置 m 到 n 的链表
 */
public class _92_reverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null)
            return head;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;  //第m个节点
        for (int i = m; i < n; i++) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return node.next;
    }

    class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
