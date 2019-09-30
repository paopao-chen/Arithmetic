import java.util.HashMap;
import java.util.Map;

/**
 * @author Politeness Chen
 * @create 2019--08--24  17:00
 */
public class _03_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        /*int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, ans = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;*/
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char val = s.charAt(end);
            if (map.containsKey(val)) {
                start = Math.max(start,map.get(val));
            }
            ans = Math.max(ans,end - start + 1);
            map.put(val,end);
        }
        return ans;
    }
}
