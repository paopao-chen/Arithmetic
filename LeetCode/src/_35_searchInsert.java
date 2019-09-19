/**
 * @author Politeness Chen
 * @create 2019--06--07  18:20
 */
public class _35_searchInsert {
    public int searchInsert(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (target == nums[i]) {
                temp = i;
                break;
            }
            if (target < nums[i]) {
                temp = i;
                break;
            } else {
                temp = nums.length;
            }
        }
        return temp;
    }
}
