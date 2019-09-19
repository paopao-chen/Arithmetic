import java.util.LinkedList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--08--08  20:49
 */
public class _45_LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 0 || m < 0) {
            return -1;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            for (int i = 1; i < m; i++) {
                index = (index + 1) % list.size();
            }
            list.remove(index);
        }

        return list.get(0);
    }
}
