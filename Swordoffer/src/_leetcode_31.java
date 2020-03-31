import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2020--03--31  19:55
 */
public class _leetcode_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0) return true;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (stack.size() > 0 && stack.peek() == popped[index]) {
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }
}
