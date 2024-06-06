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
    private List<Integer> prev = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        TreeNode current = root;
        return dfs(current, 0);
    }

    private boolean dfs(TreeNode current, int level) {
        if (current == null) {
            return true;
        }
        if (current.val % 2 == level % 2) {
            return false;
        }
        while (prev.size() <= level) {
            prev.add(0);
        }
        if (prev.get(level) != 0 && ((level % 2 == 0 && current.val <= prev.get(level)) || (level % 2 == 1 && current.val >= prev.get(level)))) {
            return false;
        }
        prev.set(level, current.val);
        return dfs(current.left, level + 1) && dfs(current.right, level + 1);
    }
}

// https://leetcode.com/problems/even-odd-tree/?envType=daily-question&envId=2024-02-29