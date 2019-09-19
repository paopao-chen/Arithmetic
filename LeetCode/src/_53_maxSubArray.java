/**
 * @author Politeness Chen
 * @create 2019--06--30  21:34
 */
public class _53_maxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int ans = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}
