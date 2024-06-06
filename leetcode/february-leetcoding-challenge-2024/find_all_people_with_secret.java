class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] meeting : meetings) {
            int x = meeting[0], y = meeting[1], t = meeting[2];
            graph.computeIfAbsent(x, k -> new ArrayList<>()).add(new int[]{t, y});
            graph.computeIfAbsent(y, k -> new ArrayList<>()).add(new int[]{t, x});
        }
        int[] earliest = new int[n];
        Arrays.fill(earliest, Integer.MAX_VALUE);
        earliest[0] = 0;
        earliest[firstPerson] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        queue.add(new int[]{firstPerson, 0});
        while (!queue.isEmpty()) {
            int[] personTime = queue.poll();
            int person = personTime[0], time = personTime[1];
            for (int[] nextPersonTime : graph.getOrDefault(person, new ArrayList<>())) {
                int t = nextPersonTime[0], nextPerson = nextPersonTime[1];
                if (t >= time && earliest[nextPerson] > t) {
                    earliest[nextPerson] = t;
                    queue.offer(new int[]{nextPerson, t});
                }
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (earliest[i] != Integer.MAX_VALUE) {
                answer.add(i);
            }
        }
        return answer;
    }
}

// https://leetcode.com/problems/find-all-people-with-secret/?envType=daily-question&envId=2024-02-24