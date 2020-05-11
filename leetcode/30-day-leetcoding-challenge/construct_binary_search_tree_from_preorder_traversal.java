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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        
        TreeNode root = null;
        
        for (int i : preorder) {
            root = helper(root, i);
        }
        
        return root;
    }
    
    public TreeNode helper(TreeNode node, int i) {
        if(node == null) {
            return new TreeNode(i);
        }
        
        if(i < node.val) {
            node.left = helper(node.left, i);
        } else {
            node.right = helper(node.right, i);
        } 
        
        return node;
    }
}