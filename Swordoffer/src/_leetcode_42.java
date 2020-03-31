/**
 * @author Politeness Chen
 * @create 2020--03--31  19:03
 *
 * 连续子数组的最大和
 */
// 也是动态规划的思想，只不过把dp[i]换成了result
// 当 dp[i - 1] > 0dp[i−1]>0 时：执行 dp[i] = dp[i-1] + nums[i]dp[i]=dp[i−1]+nums[i] ；
// 当 dp[i - 1] \leq 0dp[i−1]≤0 时：执行 dp[i] = nums[i]dp[i]=nums[i] ；
public class _leetcode_42 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (result > 0) {
                result += num;
            } else {
                result = num;
            }
            max = Math.max(result, max);
        }
        return max;
    }
}

/**
 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 输出: 6
 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */