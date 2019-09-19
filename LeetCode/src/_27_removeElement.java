import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--07  17:45
 */
public class _27_removeElement {
    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[temp ++] = nums[i];
            }
        }
        return temp;
    }

    @Test
    public void v(){
        int[] ints = {3,2,2,3};
        System.out.println(removeElement(ints,3));
    }
}
