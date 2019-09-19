/**
 * @author Politeness Chen
 * @create 2019--07--31  17:43
 */
public class _191_hammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n-1);   //二进制的减去1，与n相与n的最低位1变为0
        }
        return count;
    }
}
