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
    ListNode* rotateRight(ListNode* head, int k) {
        if (!head || k == 0) {
            return head;
        }
        ListNode* current = head;
        int c = 1;
        while (current->next != nullptr) {
            c++;
            current = current->next;
        }
        current->next = head;
        k = k % c;
        int pos = c - k; // Position where the list ends after k rotations
        ListNode* previous;
        while (pos--) {
            previous = head;
            head = head->next;
        }
        previous->next = nullptr;
        return head;
    }
};

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/