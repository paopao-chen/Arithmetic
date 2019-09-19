import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--06--10  22:02
 */
public class _20_isValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.size() == 0) {
                stack.push(c);
            } else if (isSym(stack.peek(),c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }

    private boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    /*while (s.contains("{}")||s.contains("[]")|| s.contains("()")){

            if(s.contains("{}")) s=s.replace("{}","");
            if(s.contains("()")) s=s.replace("()","");
            if(s.contains("[]")) s=s.replace("[]","");

        }

        return s.isEmpty();*/
}
