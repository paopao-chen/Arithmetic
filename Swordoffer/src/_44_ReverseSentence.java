import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--08  20:22
 */
public class _44_ReverseSentence {
    public String ReverseSentence(String str) {
        if (str.trim().equals("")) {
            return str;
        }
        StringBuilder strs = new StringBuilder(str.length());
        String[] a = str.split(" ");
        for (int i = a.length-1; i >= 0; i--) {
            if (i == 0)
                strs.append(a[i]);
            else
                strs.append(a[i] + " ");
        }
        return strs.toString();
    }

    @Test
    public void t(){
        System.out.println(-4>>1);
    }
}
