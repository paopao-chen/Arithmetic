/**
 * @author Politeness Chen
 * @create 2020--04--02  20:59
 * 股票的最大利润
 */
public class _leetcode_63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int pre = prices[0];
        int max = 0;
        for (int num : prices) {
            if (num < pre) {
                pre = num;
            } else {
                int temp = num;
                max = Math.max(max, temp - pre);
            }
        }
        return max;
    }
}
