/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number[]} voyage
 * @return {number[]}
 */
var flipMatchVoyage = function(root, voyage) {
    let result = [], vix = 0
    const dfs = node => {
        if (!node || result[0] === -1) {
            return;
        }
        if (node.val !== voyage[vix++]) {
            result = [-1]
        } else if (node.left && node.left.val !== voyage[vix]) {
            result.push(node.val)
            dfs(node.right)
            dfs(node.left)
        } else {
            dfs(node.left)
            dfs(node.right)
        }
    }
    dfs(root)
    return result;
};

// https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/592/week-5-march-29th-march-31st/3689/