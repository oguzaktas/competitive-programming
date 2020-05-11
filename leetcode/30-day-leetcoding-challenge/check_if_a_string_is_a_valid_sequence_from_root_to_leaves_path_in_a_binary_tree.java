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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (arr.length == 0 || root == null) {
            return false;
        }
        
        return dfs(root, arr, 0, arr.length);
    }
    
    public boolean dfs(TreeNode root, int[] arr, int index, int len) {
        if (root == null) {
            return false;
        } else if (index == len) {
            return false;
        } else if (root.val != arr[index]) {
            return false;
        } else if (root.left == null && root.right == null && index == len - 1) {
            return true;
        }
        
        boolean left = dfs(root.left, arr, index + 1, len);
        boolean right = dfs(root.right, arr, index + 1, len);
        
        return left || right;
    }
}

// https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3315/