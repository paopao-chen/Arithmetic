/**
 * @author Politeness Chen
 * @create 2019--08--04  20:24
 */
public class _30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        //连续子序列的最大和  动态规划
        int ans = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum> 0) {
                sum += array[i];
            } else {
                sum = array[i];
            }
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
