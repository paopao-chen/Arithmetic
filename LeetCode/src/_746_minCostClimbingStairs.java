/**
 * @author Politeness Chen
 * @create 2019--08--11  18:24
 */
public class _746_minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        //题中给了cost>=2
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.max(dp[dp.length-1],dp[dp.length-2]);
    }
}
