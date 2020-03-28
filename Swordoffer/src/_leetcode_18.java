/**
 * @author Politeness Chen
 * @create 2020--03--28  23:16
 *
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
// 使用一个节点记录要删除的那个节点的前一个节点
public class _leetcode_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode node = head;
        if (node.val == val) return node.next; // 删除头结点
        while (node.val != val) {
            pre = node;
            node = node.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
