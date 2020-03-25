import java.util.List;

/**
 * @author Politeness Chen
 * @create 2020--03--25  19:40
 *
 * 链表中倒数第K个节点
 * 要倒数的数值就要双指针
 */
public class _leetcode_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode cur = head;
        while (cur != null && k > 0) {
            cur = cur.next;
            k --;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}
