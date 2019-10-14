import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--10--13  21:59
 */
public class _151_reverseWords {
    public String reverseWords(String s) {
        if (s.length() == 0 || s.trim().length() == 0)
            return "";
        StringBuffer sb = new StringBuffer(s.length());
        String[] str = s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].length() != 0) {
                if (i == 0)
                    sb.append(str[i]);
                else
                    sb.append(str[i] + " ");
            }
        }
        return str[0].length() == 0 ? sb.substring(0,sb.length()-1) : sb.toString();
    }
}
