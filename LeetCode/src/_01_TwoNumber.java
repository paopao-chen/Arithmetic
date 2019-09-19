import org.junit.Test;

import java.util.HashMap;

/**
 * @author Politeness Chen
 * @create 2019--04--28  22:00
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 */
public class _01_TwoNumber {

    //复杂度为O(n²)
    /*@Test
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }*/

    @Test
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        int complent = 0;
        for (int i = 0; i < nums.length; i++) {
            complent = target - nums[i];
            if (map.containsKey(complent)) {
                return new int[] {map.get(complent),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
