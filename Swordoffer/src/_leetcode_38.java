import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Politeness Chen
 * @create 2020--04--04  21:29
 */
public class _leetcode_38 {
    ArrayList<String> list = new ArrayList<>();
    char[] chars;
    public String[] permutation(String s) {
        if (s.length() == 0 || s == null) return new String[0];
        chars = s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }

    private void dfs(int index) {
        if (index == chars.length - 1) {
            list.add(String.valueOf(chars));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++) {
            if (set.contains(chars[i])) continue;
            set.add(chars[i]);
            swap(i, index); // 交换，固定此位为 c[i]
            dfs(index + 1); // 开启固定第 x + 1 位字符
            swap(i, index); // 恢复交换
        }
    }

    private void swap(int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
        /*chars[a] ^= chars[b];// 不能异或
        chars[b] ^= chars[a];
        chars[a] ^= chars[b];*/
    }
}
