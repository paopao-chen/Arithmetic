/**
 * @author Politeness Chen
 * @create 2019--09--22  18:33
 */
public class _46_Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean res = (n > 0) && ((sum+=Sum_Solution(n-1)) > 0);  //利用短路与的特点求和
        return sum;
    }
}
