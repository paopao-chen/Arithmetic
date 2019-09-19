/**
 * @author Politeness Chen
 * @create 2019--06--07  17:14
 *
 * 只需要一趟判断下来就ok，每次前面的判断过就无需判断，只要最后count！=0就是满足条件
 */
public class _169_majorityElement {
    public int majorityElement(int[] nums) {
        int ret = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (ret == nums[i]) {
                count ++;
            } else {
                count --;
                if (count == 0) {
                    ret = nums[i + 1];
                }
            }
        }
        return ret;
    }
}
