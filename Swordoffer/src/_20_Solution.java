import java.util.Stack;

/**
 * @author Politeness Chen
 * @create 2019--08--10  18:35
 */
public class _20_Solution {

    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node <= minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        if (dataStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
