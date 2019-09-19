/**
 * @author Politeness Chen
 * @create 2019--08--02  20:41
 */
public class _13_reOrderArray {
    public void reOrderArray(int[] array) {
        //冒泡排序思想
        /*for (int i = 0; i < array.length; i++) {
            boolean b = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] % 2 == 0 && array[j+1] % 2 == 1) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    b = true;
                }
            }
            if (!b) break;
        }*/

        /**
         * 1.要想保证原有次序，则只能顺次移动或相邻交换。
         * 2.i从左向右遍历，找到第一个偶数。
         * 3.j从i+1开始向后找，直到找到第一个奇数。
         * 4.将[i,...,j-1]的元素整体后移一位，最后将找到的奇数放入i位置，然后i++。
         * 5.终止条件：j向后遍历查找失敗。
         */
        if (array == null || array.length == 0)
            return;
        int i = 0, j;
        while (i < array.length) {
            while (i < array.length && !isEven(array[i]))
                i++;
            j = i + 1;
            while (j < array.length && isEven(array[j]))
                j++;
            if (j < array.length) {
                int tmp = array[j];
                for (int k = j - 1; k >= i; k--) {
                    array[k + 1] = array[k];   //插入排序思想
                }
                array[i++] = tmp;
            } else {// 查找失敗
                break;
            }
        }

    }


    boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }
}
