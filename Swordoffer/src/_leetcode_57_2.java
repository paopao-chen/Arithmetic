import java.util.ArrayList;

/**
 * @author Politeness Chen
 * @create 2020--04--01  23:08
 *
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 1 <= target <= 10^5
 *
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 */
// 滑动窗口  因为最小两个数，所以<=target/2就好了
public class _leetcode_57_2 {
    public int[][] findContinuousSequence(int target) {
        ArrayList<int[]> res = new ArrayList<>();
        int left = 1, right = 1;
        int sum = 1;
        while (left <= target / 2) {
            if (sum < target) {
                right ++;
                sum += right;
            } else if (sum > target) {
                sum -= left;
                left ++;
            } else {
                int[] arr = new int[right-left+1];
                int index = 0;
                for (int i = left; i <= right; i++) {
                    arr[index ++] = i;
                }
                res.add(arr);
                sum -= left;
                left ++;
            }
        }
        return res.toArray(new int[0][]); // 要看源码
    }
}
