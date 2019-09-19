
/**
 * @author Politeness Chen
 * @create 2019--08--02  19:55
 */
public class _06_minNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        /*Arrays.sort(array);
        return array[0];*/
        int i = array.length-1;
        while (i > 0) {
            if (array[i-1] > array[i]) {
                return array[i];
            }
            i --;
        }
        return i;
    }
}
