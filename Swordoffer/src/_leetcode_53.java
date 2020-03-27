/**
 * @author Politeness Chen
 * @create 2020--03--27  21:24
 *
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 */
// 最简单是直接遍历求差值，但是既然有序就用二分找到第一个元素与下标不一致的左边界
public class _leetcode_53 {
    public int missingNumber(int[] nums) {
        /*if (nums.length < 2) return 1;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 2) {
                result = nums[i] - 1;
            }
        }
        return result;*/
        if (nums.length < 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
