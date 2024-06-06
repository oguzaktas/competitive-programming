class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        # Kadane's algorithm
        if 2 * k >= len(prices):
            return sum(max(0, prices[i] - prices[i - 1]) for i in range(1, len(prices)))       
        pnl = [0] * len(prices)
        for _ in range(k):
            val = 0
            for i in range(1, len(pnl)):
                val = max(pnl[i], val + prices[i] - prices[i - 1]) 
                pnl[i] = max(pnl[i - 1], val)
        return pnl[-1]

# https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3499/
# Solution (dynamic programming approach and merging approach): https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/solution/