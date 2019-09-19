import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--08  20:08
 */
public class _43_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 || str.length() < n) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(n,str.length()));
        stringBuilder.append(str.substring(0,n));
        return stringBuilder.toString();
    }

    @Test
    public void t(){
        String s = "abcd";
        s.substring(1,2);
        System.out.println(s);
    }
}
