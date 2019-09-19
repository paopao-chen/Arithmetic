import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--05  21:25
 */
public class _35_InversePairs {
    public int InversePairs(int [] array) {
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j])
                    count++;
            }
        }
        return count%1000000007;
    }

    @Test
    public void t(){
        int[] n = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(n));
    }
}
