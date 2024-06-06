class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        no_duplicate_list = []
        for i in nums:
            if i not in nums:
                no_duplicate_list.append(i)
            else:
                no_duplicate_list.remove(i)
        return no.no_duplicate_list.pop()

'''
https://leetcode.com/problems/single-number/solution/
Complexity analysis -> Time complexity: O(n^2)
Space complexity: O(n), we need a list of size n to contain elements in nums

Approach 2: Hash table
Complexity analysis -> Time complexity: O(n)
Space complexity: O(n), the space required by hash_table is equal to the number of elements in nums

from collections import defaultdict
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hash_table = defaultdict(int)
        for i in nums:
            hash_table[i] += 1
        for i in hash_table:
            if hash_table[i] == 1:
                return i
'''

'''
Approach 3: Math
Complexity analysis -> Time complexity: O(n)
Space complexity -> O(n), O(n + n) = O(n), set needs space for the elements in nums

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return 2 * sum(set(nums)) - sum(nums)
'''

'''
Approach 4: Bit manipulation
a ^ a = 0
a ^ a ^ b ^ c ^ b = c
So we can XOR all bits together to find the unique number
Complexity analysis -> Time complexity: O(n)
Space complexity -> O(1)

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a = 0
        for i in nums:
            a ^= i
'''
