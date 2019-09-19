/**
 * @author Politeness Chen
 * @create 2019--07--30  18:00
 */
public class _344_reverseString {
    public void reverseString(char[] s) {
        /*int i = 0,j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i ++;
            j --;
        }*/
        //两数交换不使用临时变量则使用异或运算
        int a = 0,b = s.length - 1;
        while (a < b) {
            s[a] ^= s[b];
            s[b] ^= s[a];
            s[a] ^= s[b];
            a++;b--;
        }
    }
}
