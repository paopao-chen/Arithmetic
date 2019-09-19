/**
 * @author Politeness Chen
 * @create 2019--08--09  12:41
 */
public class _54_EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead == null) {
            return null;
        }
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p2 != null && p1 != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                p2 = pHead;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if (p1 == p2) {
                    return p1;
                }
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
