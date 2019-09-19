/**
 * @author Politeness Chen
 * @create 2019--08--12  11:24
 */
public class _64_minPathSum {
    public int minPathSum(int[][] grid) {  //二维dp
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = grid.length-1; i >= 0; i--) {
            for (int j = grid[0].length-1; j >= 0; j--) {
                if (i == grid.length-1 && j != grid[0].length-1)
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                else if (i != grid.length-1 && j == grid[0].length-1)
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                else if (i != grid.length-1 && j != grid[0].length-1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j+1],dp[i+1][j]);
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }
}
