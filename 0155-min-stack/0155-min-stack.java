class MinStack {

    List<Integer> stack, minStack;
    int top;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        top = -1;
    }
    
    public void push(int v) {
        stack.add(v);
        int minStackSize = minStack.size();

        if (minStackSize > 0) 
            minStack.add(Math.min(minStack.get(minStackSize - 1), v));
        else {
            minStack.add(v);
        }

        top++;
    }
    
    public void pop() {
        stack.remove(top);
        minStack.remove(top);
        top--;
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        return minStack.get(top);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */