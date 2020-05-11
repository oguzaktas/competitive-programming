class FirstUnique:

    def __init__(self, nums: List[int]):
        self.deque = collections.deque()
        self.lookup = {}
        
        for num in nums:
            self.add(num)
        

    def showFirstUnique(self) -> int:
        if len(self.deque) == 0:
            return -1
        
        while len(self.deque) > 0 and self.deque[0] in self.lookup and self.lookup[self.deque[0]] >= 2:
            self.deque.popleft()
        
        if len(self.deque) == 0:
            return -1
        return self.deque[0]
        

    def add(self, value: int) -> None:
        if value in self.lookup:
            self.lookup[value] += 1
        else:
            self.lookup[value] = 1
        
        self.deque.append(value)
        


# Your FirstUnique object will be instantiated and called as such:
# obj = FirstUnique(nums)
# param_1 = obj.showFirstUnique()
# obj.add(value)

# https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/

''' Clean Python 3 - set and dict
class FirstUnique:
    def __init__(self, nums: List[int]):
        self.banned = set()
        self.once = {}
        for num in nums:
            self.add(num)

    def showFirstUnique(self) -> int:
        for num in self.once:
            return num
        return -1

    def add(self, value: int) -> None:
        if value in self.once:
            self.banned.add(value)
            del self.once[value]
        elif value not in self.banned:
            self.once[value] = True
'''