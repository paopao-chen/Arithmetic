import java.util.HashSet;
import java.util.Set;

/**
 * @author Politeness Chen
 * @create 2020--03--18  22:04
 *
 * 找出字符串中重复的数字
 * 首先想到双重循环（时间复杂度n²），然后想到用空间换时间，用一个数组存储
 */
public class _leetcode_03 {
    public int findRepeatNumber(int[] nums) {
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return 0;*/
        /*Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return 0;*/
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
            if (arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return 0;
    }
}
