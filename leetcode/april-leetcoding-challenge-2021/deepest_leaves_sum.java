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
    int result;
    
    public int deepestLeavesSum(TreeNode root) {
        int levels = height(root);
        deepestNode(root, levels);
        return result;
    }
    
    public void deepestNode(TreeNode root, int levels) {
        if (root == null) {
            return;
        }
        
        if (levels == 1) {
            result += root.val;
        } else if (levels > 1) {
            deepestNode(root.left, levels - 1);
            deepestNode(root.right, levels - 1);
        }
        
    }
    
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    /* Initial solution step method
    public void findNode(TreeNode root, int level, int maxLevel, int result) {
        if (root != null) {
            findNode(root.left, ++level, maxLevel, result);
            if (level > maxLevel) {
                result = root.val;
                maxLevel = level;
            }
            findNode(root.right, level, maxLevel, result);
        }
    }
    */
}

// https://leetcode.com/explore/featured/card/april-leetcoding-challenge-2021/594/week-2-april-8th-april-14th/3704/