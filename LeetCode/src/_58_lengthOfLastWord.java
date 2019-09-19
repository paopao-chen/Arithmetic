import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--07--14  9:54
 */
public class _58_lengthOfLastWord {
    public int lengthOfLastWord(String s) {    //我测试结果正确，就是过不了......
        if (s.trim().length()== 0 || s == null) {
            return 0;
        }
        /*s = new StringBuffer(s).reverse().toString();
        String[] s1 = s.split(" ");
        if (s1.length == 0)
            return s.length();
        else
            return s1[0].length();*/

        String[] s1 = s.split(" ");
        if (s1.length == 0)
            return 0;
        return s1[s1.length - 1].length();
    }

    @Test
    public void i (){
        String s = "a";
        s = new StringBuffer(s).reverse().toString();
        String[] s1 = s.split(" ");
        System.out.println(s1[0].length());

        System.out.println(lengthOfLastWord("a"));
    }
}
