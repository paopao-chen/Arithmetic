/**
 * @author Politeness Chen
 * @create 2019--08--01  17:12
 */
public class _07_Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1 || n == 2) return 1;
        int f1 = 1, f2 = 1, f3 = 0;
        for (int i = 2; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }
}
