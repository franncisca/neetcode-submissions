class MinStack {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> preStack = new Stack<>();

    public MinStack() {}
    
    public void push(int val) {
        this.minStack.push(val); 
        if (this.preStack.isEmpty()) {
            this.preStack.push(val);
        }
        else {
            //Compare with the previous minimal element
            int pre = this.preStack.peek();
            if (val < pre) {
                 this.preStack.push(val);
            }
            else {
                this.preStack.push(pre);
            }
        }       
    }
    
    public void pop() {
        this.minStack.pop();
        this.preStack.pop();
    }
    
    public int top() {
        return this.minStack.peek();
    }
    
    public int getMin() {
        return this.preStack.peek();
    }
}
