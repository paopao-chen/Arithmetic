import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--05--14  22:17
 */
public class _09_isPalindrome {
    public boolean isPalindrome(int x) {
        if (x >= 0) {
            char[] chars = Integer.toString(x).toCharArray();
            int i = 0,j = chars.length-1;
            int count = 0;
            while (i < j){
                if (chars[i] == chars[j]) {
                    i++;
                    j--;
                    count++;
                } else {
                    break;
                }
            }
            if (count == chars.length/2) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void t(){
        boolean a = isPalindrome(10);
        System.out.println(a);
    }
}
