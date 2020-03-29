/**
 * @author Politeness Chen
 * @create 2020--03--29  20:51
 * 旋转数组的最小数字
 */
public class _leetcode_11 {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) return 0;
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right --;
            }
        }
        return numbers[left];
    }
}
