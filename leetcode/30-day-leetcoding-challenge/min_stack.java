class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack();
    Stack<Integer> minVals = new Stack();

    public MinStack() {
        
    }
    
    public void push(int x) {
        if (minVals.isEmpty() || x <= minVals.peek()) {
            minVals.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if (stack.peek().equals(minVals.peek())) {
            minVals.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minVals.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 /* Java solution using one stack
 class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        // only push the old minimum value when the current 
        // minimum value changes after pushing the new value x
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value, 
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
*/