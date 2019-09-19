/**
 * @author Politeness Chen
 * @create 2019--06--20  22:29
 */
public class _26_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        //删除排序数组中的重复项
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != nums[j]) {
                j ++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
