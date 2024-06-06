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
    private int count;

    public int equalToDescendants(TreeNode root) {
        countNodes(root);
        return count;
    }

    private long countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long left = countNodes(root.left);
        long right = countNodes(root.right);
        if (root.val == left + right) {
            count++;
        }
        return left + right + root.val;
    }
}

// https://leetcode.com/problems/count-nodes-equal-to-sum-of-descendants/