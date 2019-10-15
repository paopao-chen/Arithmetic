import java.util.HashSet;
import java.util.Set;

/**
 * @author Politeness Chen
 * @create 2019--10--15  19:48
 */
public class _141_hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node1 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node2 == null)
                return false;
            if (node1 == node2)
                return true;
        }
        return false;
        /*Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return false;*/
    }

    class ListNode{
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
