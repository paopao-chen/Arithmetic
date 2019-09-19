import org.junit.Test;

/**
 * @author Politeness Chen
 * @create 2019--05--13  22:28
 */
public class _07_Reverse {
    public int reverse(int x) {
        char[] chars = Long.toString(x).toCharArray();
        if (chars[0] != '-') {
            int i = 0;
            int j = chars.length - 1;
            while (i < j) {
                swap(chars,i++,j--);
            }
            try{
                return Integer.parseInt(String.valueOf(chars));
            } catch (Exception e) {
                return 0;
            }
        } else {
            int i = 1;
            int j = chars.length - 1;
            while (i < j) {
                swap(chars,i++,j--);
            }
            try{
                return Integer.parseInt(String.valueOf(chars));
            } catch (Exception e) {
                return 0;
            }
        }

    }

    public static void swap(char[] chars,int a,int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

    @Test
    public void t(){
        int a = reverse(-1234567);
        System.out.println(a);
    }

    @Test
    public void t1(){
        int a = reverse(1234567);
        System.out.println(a);
    }
}
