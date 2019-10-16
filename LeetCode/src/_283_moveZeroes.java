import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--10--16  20:12
 */
public class _283_moveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                nums[i++] = nums[k];
            }
        }
        while (i <= nums.length - 1)
            nums[i++] = 0;
    }

    @Test
    public void t(){
        int[] num = {0,1,0,3,12};
        moveZeroes(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
