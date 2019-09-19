import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--05  20:51
 */
public class _33_GetUglyNumber_Solution {
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
    }

    @Test
    public void t(){
        System.out.println(GetUglyNumber_Solution(6));
    }
}
