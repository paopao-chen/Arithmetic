import java.util.Arrays;

/**
 * @author Politeness Chen
 * @create 2019--08--13  16:07
 */
public class _1029_twoCitySchedCost {
    public int twoCitySchedCost(int[][] costs) {
        int[] A = new int[costs.length];
        int res = 0;
        for (int i = 0; i < costs.length; i++) {
            A[i] = costs[i][0] - costs[i][1]; //A-B的花费
            res += costs[i][1]; //都去B的花费
        }
        Arrays.sort(A);
        for (int i = 0; i < costs.length/2; i++) {
            res += A[i];
        }
        return res;
    }
}
