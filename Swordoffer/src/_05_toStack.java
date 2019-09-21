import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--09--21  19:12
 */
public class _05_toStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);   //压入栈1
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());  //出栈是先把栈1的出栈加入栈2，这样再从栈2出栈就是输入的顺序
            }
        }
        if (stack2.isEmpty())
            return 0;
        return stack2.pop();
    }
}
