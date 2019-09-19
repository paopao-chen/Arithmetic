import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Politeness Chen
 * @create 2019--06--09  19:23
 */
public class _202_isHappy {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            if (n == 1) {
                return true;
            }
            set.add(n);
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10,2);
                n /= 10;
            }
            n = sum;
        }

        return false;
    }

    @Test
    public void e(){
        System.out.println(isHappy(19));
    }
}
