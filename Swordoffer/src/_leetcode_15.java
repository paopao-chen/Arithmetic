import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2020--03--25  20:42
 *
 * 用&来判断末尾是不是1，需要注意int32位但是首位是符号位
 */
public class _leetcode_15 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            /*if ((n & 1) == 1) {
                count += 1;
            }*/
            count += n & 1; // 与末尾的数值一样
            n = n >>> 1;
        }
        return count;
    }
    @Test
    public void t() {
        System.out.println(hammingWeight(2147483645));
    }
}
