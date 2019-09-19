/**
 * @author Politeness Chen
 * @create 2019--07--20  12:23
 */
public class _70_climbStairs {
    public int climbStairs(int n) {
        //动态规划
        /*int[] jump = new int[n+1];
        jump[0] = 1;
        jump[1] = 1;
        for (int i = 2; i <= n; i++) {
            jump[i] = jump[i-1] + jump[i-2];
        }
        return jump[n];*/
        //斐波那契
        if (n <= 2) return n;
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}
