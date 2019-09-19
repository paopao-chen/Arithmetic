/**
 * @author Politeness Chen
 * @create 2019--06--30  20:11
 */
public class _28_strStr {  //相当于java的indexOf方法
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
