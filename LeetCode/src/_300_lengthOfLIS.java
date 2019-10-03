/**
 * @author Politeness Chen
 * @create 2019--10--03  22:11
 */
public class _300_lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int ans = 1;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            int val = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    val = Math.max(val,dp[j]);
                }
            }
            dp[i] = val + 1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
