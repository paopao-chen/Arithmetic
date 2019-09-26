/**
 * @author Politeness Chen
 * @create 2019--09--26  21:14
 *
 * 找出字符流中第一个只出现一次的字符
 */
public class _53_Solution {
    //Insert one char from stringstream
    StringBuffer s = new StringBuffer();
    int[] hash = new int[256];
    public void Insert(char ch) {
        s.append(ch);
        hash[ch] ++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return '#';
    }
}
