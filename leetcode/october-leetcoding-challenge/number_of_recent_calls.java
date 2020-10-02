class RecentCounter {

    List<Integer> requests;
    
    public RecentCounter() {
        requests = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        int result = 0;
        requests.add(t);
        for (int i : requests) {
            if (i >= t - 3000 && i <= t) {
                result++;
            }
        }
        return result;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
 
 // https://leetcode.com/explore/featured/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3480/

 /* Java linked list iterating with sliding window
 class RecentCounter {
    LinkedList<Integer> slideWindow;
    public RecentCounter() {
        this.slideWindow = new LinkedList<Integer>();
    }
    public int ping(int t) {
        // step 1). append the current call
        this.slideWindow.addLast(t);
        // step 2). invalidate the outdated pings
        while (this.slideWindow.size() > 0) {
            if (this.slideWindow.getFirst() < t - 3000)
                this.slideWindow.removeFirst();
            else
                break;
        }
        return this.slideWindow.size();
    }
}
*/
