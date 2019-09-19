import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--06--01  15:11
 *
 * 杨辉三角2
 */
public class _119_getRow {
    /*public List<Integer> getRow(int rowIndex) {  //超时,采用的递归
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex ; i++) {  //有几行
            list.clear();
            for (int j = 0; j <= i ; j++) {   //每行有几个
                list.add(num(i,j));
            }
        }
        return list;
    }

    private Integer num(int i, int j) {
        Integer sum = 0;
        if (j == 0 || j == i) {
            sum = 1;
        } else {
            sum = num(i-1,j-1) + num(i-1,j);
            return sum;
        }

        return sum;
    }*/
    /**
     * 获取杨辉三角的指定行
     * 直接使用组合公式C(n,i) = n!/(i!*(n-i)!)
     * 则第(i+1)项是第i项的倍数=(n-i)/(i+1);
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long num = 1L;
        for (int i = 0; i <= rowIndex ; i++) {
            list.add((int) num);
            num = num * (rowIndex - i)/(i + 1);
        }
        return list;
    }

    @Test
    public void t(){
        System.out.println(getRow(0));
    }
}
