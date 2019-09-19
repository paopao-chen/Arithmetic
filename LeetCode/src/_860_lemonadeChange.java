/**
 * @author Politeness Chen
 * @create 2019--08--13  20:38
 */
public class _860_lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) return false;
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five ++;
                break;
            } else if (bill == 10) {
                if (five == 0) return false;
                five --;
                ten ++;
            } else if (bill == 20) {
                if (five > 0 && ten > 0) {
                    five --;
                    ten --;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
