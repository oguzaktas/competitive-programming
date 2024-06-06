/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slow_ptr = head;
        ListNode* fast_ptr = head;
        if (head != NULL) {
            while (fast_ptr != NULL && fast_ptr -> next != NULL) {
                fast_ptr = fast_ptr -> next -> next;
                slow_ptr = slow_ptr -> next;
            }
        }
        return slow_ptr;
    }
};

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3290/

/* Solution - Approach 1: Output to Array -> Put every node into an array A in order.
Then the middle node is just A[A.length // 2], since we can retrieve each node by index.
Complexity analysis -> Time complexity: O(n), where n is the number of nodes in the given list.
Space complexity: O(n), the space used by A.

// C++
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        vector<ListNode*> A = {head};
        while (A.back()->next != NULL)
            A.push_back(A.back()->next);
        return A[A.size() / 2];
    }
};

// Java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head.next != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}

// Python
class Solution(object):
    def middleNode(self, head):
        A = [head]
        while A[-1].next:
            A.append(A[-1].next)
        return A[len(A) / 2]
*/

/* Approach 2: Fast and Slow Pointer -> When traversing the list with a pointer slow, make another pointer fast 
that traverses twice as fast. When fast reaches the end of the list, slow must be in the middle.
Complexity analysis -> Time complexity: O(n), where n is the number of nodes in the given list.
Space complexity: O(1), the space used by slow and fast.

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};
*/
