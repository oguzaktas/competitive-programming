/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* fast = head;
        ListNode* slow = head;
        while (fast != NULL && fast->next != NULL) {
            fast = fast->next->next;
            slow = slow->next;
        }
        slow = reversed(slow);
        fast = head;
        while (slow != NULL) {
            if (slow->val != fast->val) {
                return false;
            }
            slow = slow->next;
            fast = fast->next;
        }
        return true;
    }
    
    ListNode* reversed(ListNode* head) {
        ListNode* prev = NULL;
        while (head != NULL) {
            ListNode* next = head->next;
            head->next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
};

// https://leetcode.com/explore/featured/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3693/