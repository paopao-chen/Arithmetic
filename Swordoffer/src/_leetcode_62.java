import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2020--03--31  17:55
 *
 * 圆圈中最后剩下的数字
 */
public class _leetcode_62 {
    public int lastRemaining(int n, int m) {
        if (n < 0 || m < 0) return 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            /*for (int i = 1; i < m; i++) {  时间复杂度过高
                index = (index + 1) % list.size();
            }
            list.remove(index);*/
            index = (index + m - 1) % n;
            list.remove(index);
            n --;
        }
        return list.get(0);
    }
}
