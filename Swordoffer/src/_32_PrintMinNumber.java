import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Politeness Chen
 * @create 2019--08--05  20:40
 */
public class _32_PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        String str = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);  //降序排列
            }
        });

        for (int j : list) {
            str += j;
        }
        return str;
    }

    @Test
    public void t(){
        int[] num = {3,5,1,4,2};
        System.out.println(PrintMinNumber(num));
    }
}
