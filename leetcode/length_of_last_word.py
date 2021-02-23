class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return 0 if len(s.split()) == 0 else len(s.split()[-1])
        # return len(s.rstrip(' ').split(' ')[-1])

# https://leetcode.com/problems/length-of-last-word/