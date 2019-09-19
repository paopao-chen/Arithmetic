import java.util.ArrayList;

/**
 * @author Politeness Chen
 * @create 2019--08--03  21:39
 */

//最小的k个数
public class _29_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input==null||input.length==0||input.length<k||k<=0) {
            return res;
        }
        int i = 0, j = input.length-1;
        int index = partition(i,j,input);
        while (index != k-1) {
            if (index < k-1) {
                i = index+1;
                index = partition(i,j,input);
            } else {
                j = index-1;
                index = partition(i,j,input);
            }
        }
        for (int l = 0; l < k; l++) {
            res.add(input[l]);
        }
        return res;
    }
    public int partition (int left, int right, int[] a) {
        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp)
                right --;
            a[left] = a[right];
            while (left < right && a[left] <= temp)
                left ++;
            a[right] = a[left];
        }
        a[left] = temp;
        return left;
    }
}
