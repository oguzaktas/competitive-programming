class MovingAverage {
    /*
    int size, sum = 0, count = 0;
    Deque<Integer> queue = new ArrayDeque<>();

    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        count++;
        queue.add(val);
        int tail = count > size ? (int)queue.poll() : 0;
        sum = sum - tail + val;
        return sum * 1.0 / Math.min(size, count);
    }
    */
    int size, head = 0, sum = 0, count = 0;
    int[] queue;

    public MovingAverage(int size) {
        this.size = size;
        queue = new int[size];
    }

    public double next(int val) {
        count++;
        int tail = (head + 1) % size;
        sum = sum - queue[tail] + val;
        head = (head + 1) % size;
        queue[head] = val;
        return sum * 1.0 / Math.min(size, count);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

 // https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/706/stacks-and-queues/4703/