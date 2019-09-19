/**
 * @author Politeness Chen
 * @create 2019--08--01  17:24
 */
public class _08_JumpFloor {
    public int JumpFloor(int target) {
        if (target <= 2) return target;
        int a1 = 1;
        int a2 = 2;
        for (int i = 3; i <= target; i++) {
            int jump = a1 + a2;
            a1 = a2;
            a2 = jump;
        }
        return a2;
    }
}
