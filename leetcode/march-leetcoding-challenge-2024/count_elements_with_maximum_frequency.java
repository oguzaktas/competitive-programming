class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int[] arr = new int[max+1];
        for (int num2 : nums) {
            arr[num2]++;
        }
        int maxFrequency = 0;
        for (int freq : arr) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        int countMaxFrequency = 0;
        for (int freq : arr) {
            if (freq == maxFrequency) {
                countMaxFrequency++;
            }
        }
        return maxFrequency * countMaxFrequency;
        /*
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> maxFreq = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                maxFreq.clear();
                maxFreq.add(e.getKey());
            } else if (e.getValue() == max) {
                maxFreq.add(e.getKey());
            }
        }
        int totalFreq = 0;
        for (int i = 0; i < maxFreq.size(); i++) {
            totalFreq += map.get(maxFreq.get(i));
        }
        return totalFreq;
        */
    }
}

// https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2024-03-08