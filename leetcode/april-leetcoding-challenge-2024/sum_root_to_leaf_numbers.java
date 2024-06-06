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
    private int rootToLeaf = 0;
    public int sumNumbers(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }

    private void preorder(TreeNode root, int current) {
        if (root != null) {
            current = current * 10 + root.val;
            if (root.left == null && root.right == null) {
                rootToLeaf += current;
            }
            preorder(root.left, current);
            preorder(root.right, current);
        }
    }
}

// https://leetcode.com/problems/sum-root-to-leaf-numbers/?envType=daily-question&envId=2024-04-15