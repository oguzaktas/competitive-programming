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
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val, root.val);
    }    

    private int dfs(TreeNode node, int currentMax, int currentMin) {
        if (node == null) {
            return currentMax - currentMin;
        }
        currentMax = Math.max(currentMax, node.val);
        currentMin = Math.min(currentMin, node.val);
        int left = dfs(node.left, currentMax, currentMin);
        int right = dfs(node.right, currentMax, currentMin);
        return Math.max(left, right);
    }
}

// https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4617/