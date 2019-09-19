import java.util.ArrayList;

/**
 * @author Politeness Chen
 * @create 2019--08--06  20:56
 */
public class _42_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>(2);
        if (array.length == 0) {
            return list;
        }
        int left = 0;
        int right = array.length-1;

        while (left < right) {
            if (array[left] + array[right] == sum) {
                list.add(array[left]);
                list.add(array[right]);
                break;
            } else if (array[left] + array[right] < sum) {
                left ++;
            } else {
                right --;
            }
        }

        return list;
    }
}
