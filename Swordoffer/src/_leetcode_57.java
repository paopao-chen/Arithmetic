/**
 * @author Politeness Chen
 * @create 2020--03--21  21:44
 *
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * 既然有序，就直接用双指针
 */
public class _leetcode_57 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right --;
            } else if (nums[left] + nums[right] < target) {
                left ++;
            } else {
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            }
        }
        return result;
    }
}