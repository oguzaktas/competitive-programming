class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

// https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
/* Java HashSet solution;
public boolean checkIfExist(int[] arr) {
    Set<Integer> seen = new HashSet<>();   
    for (int i : arr) {
        if (seen.contains(2 * i) || i % 2 == 0 && seen.contains(i / 2))
            return true;
        seen.add(i);
    }
    return false;
}
*/
/* Python solution with set;
def checkIfExist(self, arr: List[int]) -> bool:
    seen = set()
    for i in arr:
        # if 2 * i in seen or i % 2 == 0 and i // 2 in seen:
        if 2 * i in seen or i / 2 in seen: # credit to @PeterBohai
            return True
        seen.add(i)
    return False
*/
/* Python solution with Counter;
class Solution:
  def checkIfExist(self, arr: List[int]) -> bool:
    s = collections.Counter(arr)
    # Check if there are more than one zeros
    if(s[0]>1):
        return True;
    for num in arr:
      if s[2*num] and num!=0:
        return True
    return False
*/