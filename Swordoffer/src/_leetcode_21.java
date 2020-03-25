/**
 * @author Politeness Chen
 * @create 2020--03--24  22:46
 *
 * 调整数组顺序使奇数位于偶数前面
 * 快排双指针的思想
 */
public class _leetcode_21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left != right) {
            while (left < right && nums[left] % 2 == 1) {
                left ++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right --;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        return nums;
    }
}
