import java.util.ArrayList;

/**
 * @author Politeness Chen
 * @create 2019--08--09  20:46
 */
public class _63_maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>(num.length);
        if (size <= 0 || num.length == 0) {
            return list;
        }
        for (int i = 0; i <= num.length-size; i++) {
            int max = 0;
            for (int j = i; j < i+size; j++) {
                max = Math.max(num[j],max);
            }
            list.add(max);
        }
        return list;
    }
}
