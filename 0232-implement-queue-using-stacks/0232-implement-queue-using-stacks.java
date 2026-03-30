import java.util.*;

class MyQueue {
    private Stack<Integer> iStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        iStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        iStack.push(x);
    }
    
    public int pop() {
        moveIfNeeded();
        return outStack.pop();
    }
    
    public int peek() {
        moveIfNeeded();
        return outStack.peek();
    }
    
    public boolean empty() {
        return iStack.isEmpty() && outStack.isEmpty();
    }
    
    private void moveIfNeeded() {
        if (outStack.isEmpty()) {
            while (!iStack.isEmpty()) {
                outStack.push(iStack.pop());
            }
        }
    }
}