/**
 * @author Politeness Chen
 * @create 2019--08--03  19:42
 */
public class _12_Power {
    public double Power(double base, int exponent) {
        double res = 1,curr = base;
        if (exponent < 0) {
            exponent = - exponent;
        } else if (exponent == 0) {
            return 1;
        }
        while (exponent != 0) {
            if ((exponent & 1) == 1)
                res *= curr;
            curr *= curr;
            exponent >>= 1;
        }
        return exponent > 0 ? res:(1/res);
    }
}
