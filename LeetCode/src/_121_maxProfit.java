/**
 * @author Politeness Chen
 * @create 2019--08--11  18:03
 */
public class _121_maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > max) {
                max = prices[i] - minPrice;
            }
        }

        return max;
    }
}
