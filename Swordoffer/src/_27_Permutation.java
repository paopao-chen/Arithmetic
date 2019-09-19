import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Politeness Chen
 * @create 2019--08--21  9:34
 */
public class _27_Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        if (str != null && str.length() != 0) {
            ss(chars,0,list);
        }
        Collections.sort(list);
        return list;
    }

    private void ss(char[] chars, int i, ArrayList<String> list) {
        for (int j = 0; j < chars.length; j++) {
            if (i == chars.length - 1) {
                String str = String.valueOf(chars);
                if (!list.contains(str)) {
                    list.add(str);
                }
            } else {
                swap(chars,i,j);
                ss(chars,i+1,list);
                swap(chars,i,j);
            }
        }
    }

    private void swap(char[] chars, int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

}
