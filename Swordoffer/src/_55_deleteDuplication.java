/**
 * @author Politeness Chen
 * @create 2019--08--09  15:07
 */
public class _55_deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        ListNode list = new ListNode(0);
        list.next = pHead;

        ListNode p = pHead;
        ListNode p2 = list;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int value = p.val;
                while (p != null && p.val == value) {
                    p = p.next;
                }
                p2.next = p;
            } else {
                p2 = p;
                p = p.next;
            }
        }

        return list.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
