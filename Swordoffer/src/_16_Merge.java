/**
 * @author Politeness Chen
 * @create 2019--08--03  21:15
 */
public class _16_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            } else {
                cur.next = list2.next;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        while (list1 == null) {
            cur.next = list2;
        }
        while (list2 == null) {
            cur.next = list1;
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
