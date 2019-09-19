/**
 * @author Politeness Chen
 * @create 2019--08--06  20:05
 */
public class _40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bit = 0;
        //先进行与运算
        for (int i = 0; i < length; i++) {
            bit ^= array[i];
        }
        int index = findFirst(bit);
        for (int i = 0; i < length; i++) {
            if (isBit1(array[i],index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }

    //找到第一个1
    public int findFirst(int bit){
        int index = 0;
        while (((bit & 1) == 0) && index < 32) {
            bit >>>= 1;
            index++;
        }
        return index;
    }

    //根据第index位是否是0进行划分,是0返回true
    public boolean isBit1(int n, int index) {
        return ((n >> index) & 1) == 1;
    }
}
