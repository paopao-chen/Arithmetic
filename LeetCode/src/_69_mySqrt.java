import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--17  21:14
 */
public class _69_mySqrt {
    public int mySqrt(int x) {
        long left = 1, right = x / 2 + 1;
        while (left <= right) {
            long mid = (right + left) / 2;
            long sq = mid * mid;
            if (sq == x) {
                return (int)mid;
            } else if (sq < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int)right;
    }

    @Test
    public void i(){
        System.out.println(mySqrt(8));
    }
}
