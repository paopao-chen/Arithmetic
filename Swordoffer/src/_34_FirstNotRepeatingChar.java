/**
 * @author Politeness Chen
 * @create 2019--08--05  21:10
 */
public class _34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        //A-Z对应的ASCII码为65-90，a-z对应的ASCII码值为97-122     91-96没有字符
        int[] word = new int[58];
        for (int i = 0; i < str.length(); i++) {
            word[str.charAt(i)-65] += 1;
        }
        for(int i=0;i<str.length();i++){
            if(word[(str.charAt(i))-65]==1)
                return i;
        }
        return -1;
    }
}
