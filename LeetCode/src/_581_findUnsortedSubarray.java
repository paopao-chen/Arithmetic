import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--10--17  16:26
 */
public class _581_findUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        if (len <= 1)
            return 0;
        int high = 0,low = len - 1,max = nums[0],min = nums[len - 1];
        for (int i = 1; i < len; i++) {
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[len - i -1]);
            if (nums[i] < max) high = i;
            if (nums[len - i - 1] > min) low = len - i - 1;
        }
        return high > low ? high-low+1 : 0;
    }

    @Test
    public void t(){
        int[] num = {1,3,2,3,3};
        System.out.println(findUnsortedSubarray(num));
    }
}
