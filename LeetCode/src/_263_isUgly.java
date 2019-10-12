/**
 * @author Politeness Chen
 * @create 2019--10--12  20:25
 */
public class _263_isUgly {
    public boolean isUgly(int num) {
        if (num <= 0)
            return false;

        while (num % 5 == 0 && num > 0) {
            num /= 5;
        }
        while (num % 3 == 0 && num > 0) {
            num /= 3;
        }
        while (num % 2 == 0 && num > 0) {
            num >>= 1;
        }
        return num == 1;
    }
}
