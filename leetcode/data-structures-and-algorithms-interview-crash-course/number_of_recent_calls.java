class RecentCounter {
    LinkedList<Integer> list;

    public RecentCounter() {
        this.list = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        this.list.offer(t);
        while (this.list.element() < t - 3000) {
            this.list.poll();
        }
        return this.list.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

 // https://leetcode.com/problems/number-of-recent-calls/