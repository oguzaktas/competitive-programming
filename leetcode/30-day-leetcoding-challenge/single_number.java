// https://leetcode.com/explore/other/card/30-day-leetcoding-challenge/528/week-1/3283/
// Approach 1: List operation (time complexity: O(n^2), space complexity: O(n))
class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            if (!list.contains(i)) {
                list.add(i);
            } else {
                list.remove(new Integer(i));
            }
        }
        return list.get(0);
    }
}

/*
https://leetcode.com/problems/single-number/solution/
Complexity analysis -> Time complexity: O(n^2)
Space complexity: O(n), we need a list of size n to contain elements in nums

Approach 2: Hash table
Complexity analysis -> Time complexity: O(n)
Space complexity: O(n), the space required by hash_table is equal to the number of elements in nums

class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> hash_table = new HashMap<>();

    for (int i : nums) {
      hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
    }
    for (int i : nums) {
      if (hash_table.get(i) == 1) {
        return i;
      }
    }
    return 0;
  }
}
*/

/* Approach 3: Math (2 ∗ (a+b+c) − (a+a+b+b+c) = c)
Complexity analysis -> Time complexity: O(n)
Space complexity -> O(n), O(n + n) = O(n), set needs space for the elements in nums

class Solution {
  public int singleNumber(int[] nums) {
    int sumOfSet = 0, sumOfNums = 0;
    Set<Integer> set = new HashSet();

    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
        sumOfSet += num;
      }
      sumOfNums += num;
    }
    return 2 * sumOfSet - sumOfNums;
  }
}
*/

/* Approach 4: Bit manipulation
a ^ a = 0
a ^ a ^ b ^ c ^ b = c
So we can XOR all bits together to find the unique number
Complexity analysis -> Time complexity: O(n)
Space complexity -> O(1)

class Solution {
  public int singleNumber(int[] nums) {
    int a = 0;
    for (int i : nums) {
      a ^= i;
    }
    return a;
  }
}
*/