import java.util.PriorityQueue;

/**
 * @author Politeness Chen
 * @create 2019--09--29  21:06
 *
 * 数据流中第K大的元素
 */
public class _703_KthLargest {
    PriorityQueue<Integer> queue;  //维护一个小顶堆
    int k;
    public _703_KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);  //删除堆顶元素，插入新元素
        }
        return queue.peek();
    }
}
