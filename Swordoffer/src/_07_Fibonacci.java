import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--01  17:12
 */
public class _07_Fibonacci {
    public int Fibonacci(int n) {
        /*if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        int f1 = 1, f2 = 1, f3 = 0;
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;*/
        int[][] nums = new int[101][31];
        nums[1][30] = 1;
        nums[2][30] = 1;
        for (int i = 3; i <= 100; i++) {
            for (int j = 30; j >= 0; j--) {
                if (nums[i-1][j] + nums[i-2][j] >= 10) {
                    nums[i][j-1] += 1;
                }
                nums[i][j] = nums[i][j] + (nums[i-1][j] + nums[i-2][j]) % 10;
            }
        }
        int j = 0;
        while (nums[100][j] == 0) j++;
        for (int i = j; i < 31; i++) {
            System.out.print(nums[100][i]);
        }
        System.out.println();
        return n;
    }

    @Test
    public void t(){
        System.out.println(Fibonacci(40));
    }
}
