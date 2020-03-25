/**
 * @author Politeness Chen
 * @create 2020--03--17  22:13
 *
 * 数组中出现次数超过一半的数字
 */
public class _leetcode_39 {
    public int majorityElement(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }
            if (res == nums[i]) {
                count ++;
            } else {
                count --;
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res == nums[i]) {
                count ++;
            }
        }
        if (count > nums.length / 2) {
            return res;
        }
        return 0;
    }
}
