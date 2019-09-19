/**
 * @author Politeness Chen
 * @create 2019--05--25  22:09
 */
public class _905_sortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        //应该使用快速排序，奇数与偶数交换
        int left = 0;
        int right = A.length - 1;
        int temp;
        while (left < right) {
            if (A[left] % 2 != 0 && A[right] % 2 == 0) {
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
            if (A[left] % 2 == 0) {
                left ++;
            }
            if (A[right] % 2 != 0) {
                right --;
            }
        }
        return A;
    }
}
