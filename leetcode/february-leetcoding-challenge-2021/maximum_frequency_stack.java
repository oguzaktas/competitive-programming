import java.util.Map;

class FreqStack {

    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxfreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxfreq = 0;
    }
    
    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        if (f > maxfreq) {
            maxfreq = f;
        }
        group.computeIfAbsent(f, z -> new Stack()).push(x);
    }
    
    public int pop() {
        int x = group.get(maxfreq).pop();
        freq.put(x, freq.get(x) - 1);
        if (group.get(maxfreq).size() == 0) {
            maxfreq--;
        }
        return x;
    }
}

// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3655/

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */

//

/* Initial solution (Wrong Answer)
class FreqStack {
    
    List<Integer> stack;

    public FreqStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        Map<Integer, Integer> map = new HashMap<>();
        stack.forEach((t) -> {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        });
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue()) {
                max = e;
            } else if (e.getValue() == max.getValue()) {
                if (stack.lastIndexOf(e.getKey()) > stack.lastIndexOf(max.getKey())) {
                    max = e;
                }
            }
        }
        stack.remove(stack.lastIndexOf(max.getKey()));
        return max.getKey();
    }
    
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
*/