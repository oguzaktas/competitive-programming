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
    public int sumOfLeftLeaves(TreeNode root) {
        return preorder(root, false);
    }

    private int preorder(TreeNode root, boolean isLeft) {
        if (root.left == null && root.right == null) {
            return isLeft ? root.val : 0;
        }
        int total = 0;
        if (root.left != null) {
            total += preorder(root.left, true);
        }
        if (root.right != null) {
            total += preorder(root.right, false);
        }
        return total;
    }
}

// https://leetcode.com/problems/sum-of-left-leaves/?envType=daily-question&envId=2024-04-14