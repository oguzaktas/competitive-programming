class CustomStack {

    private int[] stack;
    private int topIndex;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        topIndex = -1;
    }
    
    public void push(int x) {
        if (topIndex < stack.length - 1) {
            stack[++topIndex] = x;
        }
    }
    
    public int pop() {
        if (topIndex >= 0) {
            return stack[topIndex--];
        }
        return -1; // stack is empty
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, topIndex + 1);
        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

 // https://leetcode.com/problems/design-a-stack-with-increment-operation/?envType=daily-question&envId=2024-09-30