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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();    
        }
        List<List<Integer>> ans = new ArrayList<>();
        boolean reverse = true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        LinkedList<Integer> levelList = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.pollFirst();
            if (current != null) {
                if (reverse) {
                    levelList.addLast(current.val);
                } else {
                    levelList.addFirst(current.val);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            } else {
                ans.add(levelList);
                levelList = new LinkedList<Integer>();
                if (queue.size() > 0) {
                    queue.addLast(null);
                }
                reverse = !reverse;
            }
        }
        return ans;
    }
}

// https://leetcode.com/explore/featured/card/leetcodes-interview-crash-course-data-structures-and-algorithms/707/traversals-trees-graphs/4621/