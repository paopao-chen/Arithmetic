/**
 * @author Politeness Chen
 * @create 2020--04--29  22:20
 * 二进制链表转整数
 */
// 每次加一个节点的值就向左位移一位   kotlin中toInt(2)函数可以直接从string转化为二进制的整数
class _1290_getDecimalValue {
    fun main(args: Array<String>): Unit {}
    fun getDecimalValue(head: ListNode?): Int {
        var head: ListNode? = head?: return 0
//        var res: Int = 0
        var str: String = ""
        while (head != null) {
//            res = (res shl 1) + head.`val`
            str += head.`val`
            head = head.next
        }
        return str.toInt(2)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
