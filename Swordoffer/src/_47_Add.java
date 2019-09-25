/**
 * @author Politeness Chen
 * @create 2019--09--25  21:16
 *
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class _47_Add {
    public int Add(int num1,int num2) {
        while (num1 != 0) {
            int temp = num1 ^ num2;
            num1 = (num1 & num2) << 1;
            num2 = temp;
        }
        return num2;
    }
}
