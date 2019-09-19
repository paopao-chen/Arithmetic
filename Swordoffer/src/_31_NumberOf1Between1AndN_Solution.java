import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--04  20:33
 */
public class _31_NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                if (j % 10 == 1)
                    count ++;
                j/=10;
            }
        }
        return count;
    }

    @Test
    public void t(){
        System.out.println(NumberOf1Between1AndN_Solution(12));
    }
}

