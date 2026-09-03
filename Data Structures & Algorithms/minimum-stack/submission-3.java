class MinStack {
    //review1 solution with 2 stacks
    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> preStack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        minStack.push(val);

        if (!preStack.isEmpty() && (val > preStack.peek()) ) {
            preStack.push(preStack.peek());
        } else {
            preStack.push(val);
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
