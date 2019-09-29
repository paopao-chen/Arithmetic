/**
 * @author Politeness Chen
 * @create 2019--09--29  20:31
 */
public class _87_partition {
    public ListNode partition(ListNode head, int x) {
        //借助虚拟头结点实现
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode node1 = dummyHead1;
        ListNode node2 = dummyHead2;
        while (head != null) {
            if (head.val < x) {
                node1.next = head;
                head = head.next;
                node1 = node1.next;
                node1.next = null;
            } else {
                node2.next = head;
                head = head.next;
                node2 = node2.next;
                node2.next = null;
            }
        }
        node1.next = dummyHead2.next;
        return dummyHead1.next;
    }

    class ListNode{
        ListNode next;
        int val;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
