import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--10--06  20:53
 *
 * 字符串解码
 */
public class _394_decodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                String tmp = "";
                while (!stack.peek().equals("[")) {
                    tmp = stack.pop() + tmp;
                }
                stack.pop(); // "["出栈

                String count = "";
                while (!stack.isEmpty() && isDight(stack.peek().charAt(0))) {
                    count = stack.pop() + count;
                }

                String str = "";
                for (int j = 0; j < Integer.parseInt(count); j++) {
                    str += tmp;
                }
                stack.push(str);
            } else {
                stack.push(s.charAt(i) + "");
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }

    private boolean isDight(char c) {
        return c > '0' && c <= '9';
    }
}
