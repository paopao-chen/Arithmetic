import java.util.ArrayList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--10--16  20:35
 *
 * [4,3,2,-7,8,2,3,1] 第一个数据 4 出现，将数组的第四个也就是下标 3 的数据修改为负数。
 * -7 计算时，通过绝对值处理一下即可不影响数据的计算
 *
 */
public class _448_findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0)
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}
