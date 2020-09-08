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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        if (root.val > R)
            return rangeSumBST(root.left, L, R);
        if (root.val < L)
            return rangeSumBST(root.right, L, R);
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);   
    }
}

// https://leetcode.com/problems/range-sum-of-bst/
/* Different Java solution;
public int rangeSumBST(TreeNode root, int L, int R) {
    if (root == null) return 0; // base case.
    return (L <= root.val && root.val <= R ? root.val : 0) + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
}
*/
/* Iterative method Python3;
def rangeSumBST(self, root: TreeNode, L: int, R: int) -> int:
    stk, sum = [root], 0
    while stk:
        node = stk.pop()
        if node:
            if node.val > L:
                stk.append(node.left)    
            if node.val < R:
                stk.append(node.right)
            if L <= node.val <= R:
                sum += node.val    
    return sum
*/
/* JavaScript solution (https://leetcode.com/problems/range-sum-of-bst/discuss/193702/JavaScript-2-solutions-easy-to-understand-beats-100)
var rangeSumBST = function(root, L, R) {
    // base case
    if(root == null) {
        return 0;
    }
    
    if(root.val > R) {
        return rangeSumBST(root.left, L, R);
    } else if(root.val < L) {
        return rangeSumBST(root.right, L, R);
    } else {
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
};
*/