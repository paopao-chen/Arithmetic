/**
 * @author Politeness Chen
 * @create 2019--08--12  16:52
 */
public class _887_superEggDrop {
    //k个鸡蛋，N层楼
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K+1][N+1];
        for (int m = 1; m <= N; m++) {
            dp[0][m] = 0;
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m-1] + dp[k-1][m-1] + 1;
                if (dp[k][m] >= N) {
                    return m;
                }
            }
        }
        return N;
    }
}
