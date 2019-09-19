import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--02  21:16
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class _136_singleNumber {  //桶排序
    public int singleNumber(int[] nums) {
        int f = 0;
        for (int i = 0; i < nums.length ; i++) {
            f = f ^ nums[i];   //与0相异或，保留原值   相同为0
        }
        return f;
    }

    @Test
    public void t(){
        System.out.println(0 ^ 8);
    }
}

