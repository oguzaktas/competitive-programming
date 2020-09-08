/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
	    int num = 0;                // Initialise num to 0
	    while(head! = null) {       // Iteratore over the linked list until head is null    
		    num <<= 1;              // Left shift num by 1 position to make way for next bit
		    num += head.val;        // Add next bit to num at least significant position
		    head = head.next;       // Update head
	    }
	return num;
    }
}

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/