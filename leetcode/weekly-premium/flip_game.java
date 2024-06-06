class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> nextPossibleStates = new ArrayList<String>();
        for (int i = 0; i < currentState.length() - 1; i++) {
            if (currentState.charAt(i) == '+' && currentState.charAt(i+1) == '+') {
                String nextState = currentState.substring(0, i) + "--" + currentState.substring(i+2);
                nextPossibleStates.add(nextState);
            }
        }
        return nextPossibleStates;
        /*
        List<String> nextPossibleStates = new ArrayList<String>();
        StringBuilder sb = new StringBuilder(currentState);
        for (int i = 1; i < currentState.length(); i++) {
            if (sb.charAt(i) == '+' && sb.charAt(i-1) == '+') {
                sb.setCharAt(i, '-');
                sb.setCharAt(i-1, '-');
                nextPossibleStates.add(sb.toString());
                sb.setCharAt(i, '+');
                sb.setCharAt(i-1, '+');
            }
        }
        return nextPossibleStates;
        */
    }
}

// https://leetcode.com/problems/flip-game/