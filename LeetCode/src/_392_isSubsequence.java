/**
 * @author Politeness Chen
 * @create 2019--08--12  15:52
 */
public class _392_isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int len = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(len) == t.charAt(i)) {
                len ++;
            }
            if (len == s.length()) return true;
        }
        return false;
    }

}
