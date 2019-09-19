/**
 * @author Politeness Chen
 * @create 2019--08--11  19:13
 */
public class _198_rob {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0],nums[1]);
        sum[3] = Math.max(nums[1],nums[0] + nums[2]);
        for (int i = 3; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 2], sum[i - 3]) + nums[i];
        }
        return Math.max(sum[sum.length-1],sum[sum.length-2]);
    }
}
