/**
 * @author Politeness Chen
 * @create 2019--08--01  17:38
 */
public class _09_JumpFloorII {
    public int JumpFloorII(int target) {
        if (target <= 2) return target;
        int a = 2, b = 0;
        for (int i = 3; i <= target; i++) {
            b = 2*a;
            a = b;
        }
        return a;
    }
}
