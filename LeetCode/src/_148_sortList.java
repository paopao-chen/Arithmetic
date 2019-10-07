/**
 * @author Politeness Chen
 * @create 2019--10--07  20:43
 *
 * 使用归并排序的思想
 */
public class _148_sortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head,q = head,pre = null;
        while (q != null && q.next != null) {
            //一个走一步一个走两步，最后p是中点
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(p);
        return merge(l,r);
    }

    private ListNode merge(ListNode l, ListNode r) {
        ListNode dummyNode = new ListNode(0);
        ListNode node = dummyNode;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                node.next = l;
                l = l.next;
            } else {
                node.next = r;
                r = r.next;
            }
            node = node.next;
        }
        if (l != null) {
            node.next = l;
        }
        if (r != null) {
            node.next = r;
        }
        return dummyNode.next;
    }

    class ListNode{
        ListNode next;
        int val;
        public ListNode(int val) {
            this.val = val;
        }
    }
}
