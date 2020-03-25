/**
 * @author Politeness Chen
 * @create 2020--03--14  22:51
 *
 * 字符串反转
 */
public class _leetcode_58 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
