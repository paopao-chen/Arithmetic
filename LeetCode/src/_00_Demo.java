import org.junit.Test;

import java.util.*;

/**
 * @author Politeness Chen
 * @create 2019--08--11  20:46
 */
public class _00_Demo {
    public String s(String str) {
        StringBuilder sb = new StringBuilder();
        if (isMatch(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '(' && str.charAt(i) != ')')
                    sb.append(str.charAt(i));
            }
        } else {
            return "";
        }
        return sb.toString();
    }

    boolean isMatch(String s){
        Map<Character,Character> bracket  = new HashMap<>();
        bracket.put(')','(');
        bracket.put(']','[');
        bracket.put('}','{');

        Stack stack = new Stack();

        for(int i = 0; i < s.length(); i++){

            Character temp = s.charAt(i);
            if(bracket.containsValue(temp)){
                stack.push(temp);
            }else if(bracket.containsKey(temp)){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == bracket.get(temp)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty()? true: false;

    }


    @Test
    public void t() {
        System.out.println(Integer.MIN_VALUE-1);
    }
}
