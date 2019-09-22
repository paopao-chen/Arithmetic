
/**
 * @author Politeness Chen
 * @create 2019--09--22  18:52
 *
 * 数组中重复的数字
 */
public class _49_duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] m = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (m[numbers[i]]) {
                duplication[0] = numbers[i];
                return true;
            }
            m[numbers[i]] = true;
        }
        return false;
    }
}
