import java.util.Arrays;

/**
 * @author Politeness Chen
 * @create 2019--08--09  21:14
 */
public class _28_MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 1;
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (count == 0) {
                count = 1;
                num = array[i];
            } else {
                if (num == array[i]) {
                    count ++;
                } else {
                    count --;
                }
            }
        }

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count ++;
            }
        }
        if (count*2 <= array.length) {
            return 0;
        }
        return num;
    }
}
