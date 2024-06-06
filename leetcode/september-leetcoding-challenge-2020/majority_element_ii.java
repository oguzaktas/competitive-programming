
import java.util.*;

class Solution1 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 2, 2, 4, 5, 2};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
            if (map.get(i) > nums.length / 3) {
                result.add(i);
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/majority-element-ii/solution/