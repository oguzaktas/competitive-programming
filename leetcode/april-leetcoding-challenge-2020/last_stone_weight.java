class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i : stones) {
            maxHeap.add(-i);
        }
        while (maxHeap.size() > 1) {
            int stoneOne = -maxHeap.remove();
            int stoneTwo = -maxHeap.remove();
            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne - stoneTwo));
            }
        }
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}

// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/
/* Priority Queue - Complexity -> Time: O(nlogn), Space: O(n)
C++;
int lastStoneWeight(vector<int>& A) {
    priority_queue<int> pq(begin(A), end(A));
    while (pq.size() > 1) {
        int x = pq.top(); pq.pop();
        int y = pq.top(); pq.pop();
        if (x > y) pq.push(x - y);
    }
    return pq.empty() ? 0 : pq.top();
}

Python using heap, O(nlogn) time;
def lastStoneWeight(self, A):
    h = [-x for x in A]
    heapq.heapify(h)
    while len(h) > 1 and h[0] != 0:
        heapq.heappush(h, heapq.heappop(h) - heapq.heappop(h))
    return -h[0]

Python using binary insort, O(n^2) time;
def lastStoneWeight(self, A):
    A.sort()
    while len(A) > 1:
        bisect.insort(A, A.pop() - A.pop())
    return A[0]
*/