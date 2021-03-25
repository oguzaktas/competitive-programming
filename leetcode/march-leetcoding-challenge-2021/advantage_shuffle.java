class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Map<Integer, Queue<Integer>> indexes = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            indexes.putIfAbsent(B[i], new LinkedList<>());
            indexes.get(B[i]).add(i);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        int[] result = new int[A.length];
        Arrays.fill(result, -1);
        Queue<Integer> unusedNums = new LinkedList<>();
        while (i < A.length && j < A.length) {
            if (A[i] > B[j]) {
                int idx = indexes.get(B[j]).poll();
                result[idx] = A[i];
                j++;
            } else {
                unusedNums.add(A[i]);   
            }
            i++;
        }
        for (int k = 0; k < A.length; k++) {
            if (result[k] == -1) {
                result[k] = unusedNums.poll();
            }
        }
        return result;
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/591/week-4-march-22nd-march-28th/3683/

/* Initial solution (Wrong Answer)
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int[] res = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            int maxElement = Integer.MIN_VALUE;
            for (int j = 0; j < A.length; j++) {
                if (A[j] > B[i]) {
                    if (A[j] < maxElement) {
                        maxElement = A[j];
                    } else {
                        if (maxElement == Integer.MIN_VALUE) {
                            maxElement = A[j];
                        }
                    }
                }
            }
            if (maxElement == Integer.MIN_VALUE) {
                maxElement = Collections.min(Arrays.stream(A).boxed().collect(Collectors.toList()));
            }
            res[i] = maxElement;
        }
        return res;
    }
}
*/