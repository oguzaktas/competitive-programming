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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();
        dfs(0, root, result, counter);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) / counter.get(i));
        }
        return result;
    }
    
    public void dfs(int level, TreeNode node, List<Double> result, List<Integer> counter) {
        if (node == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(0.0);
            counter.add(0);
        }
        result.set(level, result.get(level) + node.val);
        counter.set(level, counter.get(level) + 1);
        dfs(level + 1, node.left, result, counter);
        dfs(level + 1, node.right, result, counter);
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3661/