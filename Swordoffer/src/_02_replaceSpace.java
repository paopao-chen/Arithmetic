import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--08--01  14:46
 */
public class _02_replaceSpace {
    //没什么说的，直接用StringBuffer就可以解决
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            String j = String.valueOf(str.charAt(i));
            if (j.equals(" ")) stringBuffer.append("%20");
            else stringBuffer.append(j);
        }
        return stringBuffer.toString();
    }

    @Test
    public void t(){
        StringBuffer s =new StringBuffer("We are happy") ;
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }
}

