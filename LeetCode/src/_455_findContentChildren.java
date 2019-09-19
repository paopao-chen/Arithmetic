import java.util.Arrays;

/**
 * @author Politeness Chen
 * @create 2019--08--13  21:29
 */
public class _455_findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0, count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i ++;
                j ++;
                count ++;
            } else {
                j ++;
            }
        }
        return count;
    }
}
