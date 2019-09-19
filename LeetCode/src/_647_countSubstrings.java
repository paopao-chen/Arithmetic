/**
 * @author Politeness Chen
 * @create 2019--08--12  11:57
 */
public class _647_countSubstrings {
    //从字符串的某一位开始，尝试着去扩展子字符串
    int num = 0;
    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            count(s,i,i);  //字符串长度为奇数
            count(s,i,i+1);  //字符串长度为偶数
        }
        return num;
    }

    public void count (String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            num ++;
            left --;
            right ++;
        }
    }

}
