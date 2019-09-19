/**
 * @author Politeness Chen
 * @create 2019--08--02  19:47
 */
public class _10_RectCover {
    public int RectCover(int target) {
        if (target <= 2) return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
