import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2020--03--29  11:15
 * 最小的k个数
 */
// 快排思想 或者 选择排序好的K个数值队列遍历其余数与第一个比较
public class _leetcode_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) return new int[0];
        if (arr.length < k) return arr;
        int[] result = new int[k];
        int left = 0, right = arr.length - 1;
        int index = partition(arr, left, right);
        while (index != k - 1) {
            if (index < k - 1) {
                left = index + 1;
            } else {
                right = index - 1;
            }
            index = partition(arr, left, right);
        }
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    private int partition(int[] nums, int low, int high) {
        int v = nums[low];
        int i = low, j = high + 1;
        while (true) {
            while (++i <= j && nums[i] < v);
            while (--j >= i && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }

        nums[low] = nums[j];
        nums[j] = v;
        return j;
    }
    @Test
    public void t() {
        int[] arr = new int[]{0,0,1,2,4,2,2,3,1,4,8};
        getLeastNumbers(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
