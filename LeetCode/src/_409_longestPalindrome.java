import java.util.HashSet;

/**
 * @author Politeness Chen
 * @create 2019--07--29  10:28
 */
public class _409_longestPalindrome {
    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count ++;
            } else {
                hs.add(s.charAt(i));
            }
        }
        if (hs.isEmpty()) return count*2;   //不能判断count,因为存在只有一个字符
        else return count*2+1;
    }
}
