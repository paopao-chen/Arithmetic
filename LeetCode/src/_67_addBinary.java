/**
 * @author Politeness Chen
 * @create 2019--06--04  22:30
 *
 * 就算形参为int也转化为String
 */
public class _67_addBinary {
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        StringBuilder str = new StringBuilder();
        int temp = 0;
        while (temp == 1 || m >= 0 || n >= 0) {
            if (m >= 0 && a.charAt(m --) == '1') {
                temp ++;
            }
            if (n >= 0 && b.charAt(n --) == '1') {
                temp ++;
            }
            str.append(temp % 2);
            temp /= 2;
        }
        return str.reverse().toString();
    }
}
