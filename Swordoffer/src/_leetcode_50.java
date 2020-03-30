/**
 * @author Politeness Chen
 * @create 2020--03--30  23:04
 *
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 */
// 这种涉及字符的问题要用ascii来解决， 65 = 'A' 97='a'
public class _leetcode_50 {
    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) return ' ';
        int[] arr = new int[58];
        for (char c : s.toCharArray()) {
            arr[c - 'A'] ++;
        }
        for (char c : s.toCharArray()) {
            if (arr[c - 'A'] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
