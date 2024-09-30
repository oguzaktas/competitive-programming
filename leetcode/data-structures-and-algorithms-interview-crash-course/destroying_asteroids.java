class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        // greedy approach
        Arrays.sort(asteroids);
        long newMass = (long) mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > newMass) {
                return false;
            } else {
                newMass += asteroids[i];
            }
        }
        return true;
        /* O(n) optimal solution using stack
        long newMass = mass;
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            stack.push(asteroid);
            while (!stack.isEmpty() && stack.peek() <= newMass) {
                newMass += stack.pop();
            }
        }
        return stack.isEmpty();
        */
    }
}

// https://leetcode.com/problems/destroying-asteroids/