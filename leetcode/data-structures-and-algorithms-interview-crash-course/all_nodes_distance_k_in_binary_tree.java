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
    Map<TreeNode, TreeNode> parents = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, null);
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();
        queue.add(target);
        seen.add(target);
        int distance = 0;
        while (!queue.isEmpty() && distance < k) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                for (TreeNode neighbor : new TreeNode[]{node.left, node.right, parents.get(node)}) {
                    if (neighbor != null && !seen.contains(neighbor)) {
                        seen.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
            distance++;
        }
        List<Integer> answer = new ArrayList<>();
        for (TreeNode node : queue) {
            answer.add(node.val);
        }
        return answer;
    }

    private void dfs(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        parents.put(node, parent);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}

// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/