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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}

/* Solution - Approach 1: Depth-First Search -> Any path can be written as two arrows (in different directions) from some node,
where an arrow is a path that starts at some node and only travels down to child nodes. If we knew the maximum length arrows L, R for each child,
then the best path touches L+R+1 nodes.
Complexity analysis -> Time complexity: O(n), we visit every node once.
Space complexity -> O(n), the size of our implicit call stack during our depth-first search.

https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3293/

class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
}
*/

/* https://www.youtube.com/watch?v=M_BaOHkTtyY
class Solution {
    pair<int, int> dfs(TreeNode* root) {
        if (root == NULL) {
            return {0, 0};
        }
        pair<int, int> left = dfs(root->left);
        pair<int, int> right = dfs(root->right);
        // (diameter, depth)
        int diam = max({left.first, right.first, left.second + right.second});
        return {diam, max(left.second, right.second) + 1}
    }
public:
    int diameterOfBinaryTree(TreeNode* root) {
        return dfs(root).first;
    }
}
*/