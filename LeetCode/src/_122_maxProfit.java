/**
 * @author Politeness Chen
 * @create 2019--09--10  16:19
 */
public class _122_maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int dp_i_0 = 0;
        int dp_i_1 = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,temp - prices[i]);
        }
        return dp_i_0;
    }
}
