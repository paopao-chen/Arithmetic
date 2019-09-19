import org.junit.Test;

import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--04--28  22:14
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 */
public class _02_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listhead = new ListNode(0);
        ListNode cur = listhead;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        while (l1 != null) {
            str1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            str2.append(l2.val);
            l2 = l2.next;
        }
        //溢出了...辣鸡题
        long sum = Long.valueOf(str1.reverse().toString()) + Long.valueOf(str2.reverse().toString());
        String s = String.valueOf(sum);
        for (int i = s.length() - 1; i >= 0; i--) {
            cur.next = new ListNode(Integer.valueOf(s.charAt(i) + ""));
            System.out.println(Integer.valueOf(s.charAt(i) + ""));
            cur = cur.next;
        }
        return listhead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    @Test
    public void i(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1,l2));
    }
}

