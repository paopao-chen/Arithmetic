import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--10--12  20:08
 */
public class _179_largestNumber {
    public String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    String a = o1 + "" + o2;
                    String b = o2 + "" + o1;
                    return -a.compareTo(b);
                }
            });
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i);
        }
        if (str.charAt(0) == '0')
            return "0";
        return str;
    }

    @Test
    public void s(){
        int[] num = {3,30,34,5,9};
        System.out.println(largestNumber(num));
    }
}
