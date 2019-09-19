import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--06--01  14:17
 */
public class _118_generate {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = null;
        List<List<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < numRows ; i++) {
           list = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    Integer num1 = list2.get(i-1).get(j-1);
                    Integer num2 = list2.get(i-1).get(j);
                    list.add(num1 + num2);
                }
            }
            list2.add(list);
        }
        return list2;
    }

    @Test
    public void te(){
        System.out.println(generate(3));
    }

}
