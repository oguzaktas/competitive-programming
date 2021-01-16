/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original == target && original.val == cloned.val) {
            return cloned;
        }
        TreeNode leftPart = getTargetCopy(original.left, cloned.left, target);
        TreeNode rightPart = getTargetCopy(original.right, cloned.right, target);
        return leftPart != null ? leftPart : rightPart;
    }
}

// https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/579/week-1-january-1st-january-7th/3590/