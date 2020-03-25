import java.util.HashSet;

/**
 * @author Politeness Chen
 * @create 2019--07--29  10:28
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的 最长的回文串。
 * https://leetcode-cn.com/problems/longest-palindrome/
 */
// 主要思路就是要判断有多少个偶数的字符
public class _409_longestPalindrome {
    public int longestPalindrome(String s) {
        /*if (s.length() == 0) return 0;
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
        else return count*2+1;*/
        int[] arr = new int[58];
        int result = 0;
        for (char c : s.toCharArray()){
            arr[c - 'A'] += 1;
        }
        for (int num : arr) {
            result += (num / 2) * 2; // num - (num & 1)  判断奇偶数，相减后都是偶数
        }
        // 如果最终的长度小于原字符串的长度，说明里面某个字符出现了奇数次，那么那个字符可以放在回文串的中间，所以额外再加一。
        return result < s.length() ? result + 1 : result;
    }
}

/**
 输入:
 "abccccdd"

 输出:
 7

 解释:
 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */