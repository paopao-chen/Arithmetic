import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--05  20:51
 *
 * 把只包含质因子2、3和5的数称作丑数
 * 把1当做是第一个丑数。求按从小到大的顺序的第N个丑数
 */
public class _33_GetUglyNumber_Solution {
    /*//时间复杂度过大??
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0)
            return 0;
        int count = 0;
        int num = 0;
        while (count < index) {
            num ++;
            if (isClown(num))
                count ++;
        }
        return num;
    }

    public boolean isClown(int n) {
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;
        return n == 1;
    }*/
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        int[] res = new int[index];
        int t2 = 0,t3 = 0,t5 = 0;
        res[0] = 1;
        for (int i = 1; i < index; i++) {
            res[i] = Math.min(res[t2] * 2,Math.min(res[t3] * 3,res[t5] * 5));
            if (res[i] == res[t2] * 2) t2 ++;
            if (res[i] == res[t3] * 3) t3 ++;
            if (res[i] == res[t5] * 5) t5 ++;
        }
        return res[index-1];
    }

}
