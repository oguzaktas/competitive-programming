/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result = 0;
    
    public int findTilt(TreeNode root) {
        result = 0;
        calculateTilt(root);
        return result;
    }
    
    public int calculateTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = calculateTilt(root.left);
        int right = calculateTilt(root.right);
        result += Math.abs(left - right);
        return root.val + left + right;
    }
}

// https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/565/week-2-november-8th-november-14th/3524/

// https://www.geeksforgeeks.org/tilt-binary-tree/

/* Python solution;
class Solution:
    def findTilt(self, root: TreeNode) -> int:
        total_tilt = 0
        def valueSum(node):
            nonlocal total_tilt
            if not node:
                return 0
            left_sum = valueSum(node.left)
            right_sum = valueSum(node.right)
            tilt = abs(left_sum - right_sum)
            total_tilt += tilt
            return left_sum + right_sum + node.val
        valueSum(root)
        return total_tilt
*/