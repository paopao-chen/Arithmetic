import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--24  21:09
 */
public class _11_maxArea {
    public int maxArea(int[] height) {
        //双重循环，暴力求解
        /*int max = 0;
        for (int i = 0; i < height.length ; i++) {
            int min = 0;
            for (int j = i + 1; j < height.length ; j++) {
                if (height[i] > height[j]) {
                    min = height[j];
                } else {
                    min = height[i];
                }
                int sum = (j - i) * min;
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;*/


        //双指针一次扫描
        int max = 0;
        int l = 0,r = height.length-1;
        while (l < r) {
            max = Math.max(max,Math.min(height[l],height[r])*(r-l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }

    @Test
    public void t() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
