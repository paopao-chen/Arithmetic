import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--10--01  17:43
 */
public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        if (s.length() == 0 || s == null)
            return -1;
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) -'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (num[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    @Test
    public void t(){
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
