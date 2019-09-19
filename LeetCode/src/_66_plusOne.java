import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--14  20:43
 */
public class _66_plusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i >= 0 ; i--) {
            if (digits[i] != 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[n + 2];
        digits[0] = 1;
        return digits;
    }

    @Test
    public void t() {
        int [] a = {9};
        System.out.println(plusOne(a));
    }
}
