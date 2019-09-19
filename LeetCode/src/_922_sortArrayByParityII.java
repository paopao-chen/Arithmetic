/**
 * @author Politeness Chen
 * @create 2019--05--26  20:47
 */
public class _922_sortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int temp = 0;
        while (right >= 0 && left < A.length - 1) {
            if (left % 2 == 0 && A[left] % 2 != 0 && right % 2 != 0 && A[right] % 2 == 0) {
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
            if (A[left] % 2 == 0) {
                left += 2;
            }

            if (A[right] % 2 != 0) {
                right -= 2;
            }
        }
        return A;
    }
}

//java.lang.ArrayIndexOutOfBoundsException: 4
//  at line 7, Solution.sortArrayByParityII
//  at line 54, __DriverSolution__.__helper__
//  at line 79, __Driver__.main