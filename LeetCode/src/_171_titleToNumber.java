import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--06--04  21:49
 *
 *
 * 26进制
 */
public class _171_titleToNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() ; i++) {
            int temp = s.charAt(i) - 'A' + 1;
            sum = sum * 26 + temp;
            System.out.println(sum);
        }
        return sum;
    }

    @Test
    public void t(){
        System.out.println(titleToNumber("BC"));
    }
}
