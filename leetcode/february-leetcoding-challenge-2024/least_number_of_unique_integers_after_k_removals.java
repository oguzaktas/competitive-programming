class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        /*
        Map<Integer, Integer> sortedMap = map.entrySet()
        .stream().sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        */
        List<Integer> frequencies = new ArrayList<>(map.values());
        Collections.sort(frequencies);
        int elementsRemoved = 0;
        for (int i = 0; i < frequencies.size(); i++) {
            elementsRemoved += frequencies.get(i);
            if (elementsRemoved > k) {
                return frequencies.size() - i;
            }
        }
        return 0;
    }
}

// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/?envType=daily-question&envId=2024-02-16