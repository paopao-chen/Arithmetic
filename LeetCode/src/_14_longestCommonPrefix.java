/**
 * @author Politeness Chen
 * @create 2019--06--24  20:37
 */
public class _14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //最长公共------->前缀
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < ans.length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0,j);
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }
}
