import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--09--28  19:52
 */
public class _120_minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        /*if (triangle.size() == 0 || triangle.get(0).size() == 0)
            return 0;
        int count = 0;
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
                count = Math.min(triangle.get(i).get(j)+triangle.get(i+1).get(j),
                        triangle.get(i).get(j)+triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,count);
            }
        }
        return triangle.get(0).get(0);*/

        if (triangle.size() == 0 || triangle.get(0).size() == 0)
            return 0;
        int row = triangle.size();
        int[] dp = new int[row+1];
        for (int i = row-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
