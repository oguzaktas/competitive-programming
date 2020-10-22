class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || list.isEmpty() || list.get(list.size() - 1) < 0) {
                list.add(asteroids[i]);
            } else if (list.get(list.size() - 1) <= -asteroids[i]) {
                if (list.get(list.size() - 1) < -asteroids[i]) {
                    i--;
                }
                list.remove(list.size() - 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3502/
/* Java solution using stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        for (int ast: asteroids) {
            collision: {
                while (!stack.isEmpty() && ast < 0 && 0 < stack.peek()) {
                    if (stack.peek() < -ast) {
                        stack.pop();
                        continue;
                    } else if (stack.peek() == -ast) {
                        stack.pop();
                    }
                    break collision;
                }
                stack.push(ast);
            }
        }

        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}
*/