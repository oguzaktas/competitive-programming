class MinStack {
    private Node head;

    public MinStack() {

    }
    
    public void push(int val) {
        head = (head == null) ? new Node(val, val, null) : new Node(val, Math.min(val, head.min), head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    
    /* using ArrayList
    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return Collections.min(stack);
    }
    */
}

class Node {
    int val, min;
    Node next;
    
    Node(int val, int min, Node next) {
        this.val = val;
        this.min = min;
        this.next = next;
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

 // https://leetcode.com/problems/min-stack/