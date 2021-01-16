class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        /*
        Map<Integer, int[]> startToPiece = new HashMap<Integer, int[]>();
        // Store in a HashMap or dictionary
        for (int[] piece : pieces) {
            startToPiece.put(piece[0], piece);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!startToPiece.containsKey(arr[i])) {
                return false;
            }
            for (int j : startToPiece.get(arr[i])) {
                if (j != arr[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
        */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int[] piece : pieces) {
            if (!map.containsKey(piece[0]))
                return false;
            int index = map.get(piece[0]);
            for (int i = 1; i < piece.length; i++) {
                if (!map.containsKey(piece[i]) || map.get(piece[i]) != ++index)
                    return false;
            }
        }
        return true;
    }
}