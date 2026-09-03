class MinStack {
    //review1 solution with 2 stacks
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> preStack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        minStack.push(val);
        if (preStack.isEmpty()) {
            preStack.push(val);
        }
        else {
            if (val < preStack.peek()) {
                preStack.push(val);
            }
            else {
                preStack.push(preStack.peek());
            }
        }
    }
    
    public void pop() {
        minStack.pop();
        preStack.pop();
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return preStack.peek();
    }
}
