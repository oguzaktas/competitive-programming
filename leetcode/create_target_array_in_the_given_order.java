class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<Integer>();
        for (int i = 0; i < index.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] result = target.stream().mapToInt(i -> i).toArray();
        return result;
    }
}

// https://leetcode.com/problems/create-target-array-in-the-given-order/
/* Python solutions;
# Using the insert function;
class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        target =[]
        for i in range(len(nums)):
            target.insert(index[i], nums[i])
        return target

# Without using the insert function;
class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        target =[]
        for i in range(len(nums)):
            if index[i] == len(target) :
                target.append(nums[i])
            else:
                target = target[:index[i]] + [nums[i]] + target[index[i]:]
        return target
*/
/* JavaScript solution;
var createTargetArray = function(nums, index) {
    let result=[]
    for(let number of nums){
        let idx = index.shift();
        result.splice(idx,0,number)
    }
    return result
};
*/