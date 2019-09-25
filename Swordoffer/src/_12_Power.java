/**
 * @author Politeness Chen
 * @create 2019--08--03  19:42
 *
 * base的exponent次方
 */
public class _12_Power {
    public double Power(double base, int exponent) {
        if (base == 0)
            return 0;
        int temp = 0;
        double res = 1;
        if (exponent > 0) {
            temp = exponent;
        } else if (exponent < 0) {
            temp = -exponent;
        } else {
            return 1;  //指数为0
        }
        while (temp != 0) {
            if ((exponent & 1) == 1) {
                res *= base;
            }
            base *= base;
            temp >>= 1;
        }
        return exponent>0 ? res : 1/res;
    }
}
