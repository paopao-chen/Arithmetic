/**
 * @author Politeness Chen
 * @create 2019--10--08  21:38
 */
public class _260_singleNumber {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        if (nums.length == 2) {
            res[0] = nums[0];
            res[1] = nums[1];
            return res;
        }
        int bit = 0;
        for (int i = 0; i < nums.length; i++) {
            bit ^= nums[i];
        }
        int index = indexFirst(bit);
        for (int i = 0; i < nums.length; i++) {
            if (isIndex(index,nums[i])) {
                res[0] ^= nums[i];
            } else {
                res[1] ^= nums[i];
            }
        }
        return res;
    }

    //从后往前找到第一个出现1的地方
    private int indexFirst(int bit){
        int index = 0;
        while ((bit & 1) == 0 && index < 32){
            index ++;
            bit >>= 1;
        }
        return index;
    }

    private boolean isIndex(int n,int num) {
        return ((num >> n) & 1) == 1 ? true : false;
    }
}
