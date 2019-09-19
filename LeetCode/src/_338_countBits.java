/**
 * @author Politeness Chen
 * @create 2019--08--12  10:52
 */
public class _338_countBits {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for (int i = 0; i <= num; i++) {
            res[i] = popCount(i);
        }
        return res;
    }

    public int popCount(int num) {
        int count = 0;
        while (num != 0) {
            count ++;
            num &= num-1;
        }
        return count;
    }
}
