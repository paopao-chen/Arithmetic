import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--09--21  19:55
 */
public class _21_IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (stack.size() > 0 && stack.peek() == popA[j]) {
                stack.pop();
                j --;
            }
        }
        return stack.size() == 0;
    }
}
