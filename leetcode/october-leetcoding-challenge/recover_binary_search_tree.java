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
    TreeNode first = null, last = null, prev = null;
    public void recoverTree(TreeNode root) {
        findSegments(root);
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
    }
    
    public void findSegments(TreeNode root) {
        if (root == null) {
            return;
        }
        findSegments(root.left);
        if (prev != null) {
            if (prev.val > root.val) {
                if (first == null) {
                    first = prev;
                }
                last = root;
            }
        }
        prev = root;
        findSegments(root.right);
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/563/week-5-october-29th-october-31st/3514/

// https://www.youtube.com/watch?v=LR3K5XAWV5k