/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuilder sb = new StringBuilder();
    public static HashMap<String, TreeNode> map = new HashMap<String, TreeNode>();
    
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        sb.append(String.valueOf(root.val));
        sb.append(" ");
        helper(root.left);
        helper(root.right);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        helper(root);
        map.put(sb.toString().trim(), root);
        return sb.toString().trim();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return map.get(data);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3489/

/* C++ solution;
class Codec {
public:
    string serialize(TreeNode* root) {
        return !root ? " null" : " " + to_string(root->val) + serialize(root->left) + serialize(root->right);
    }
    TreeNode* deserialize(string data) {
        istringstream ss(data);
		return buildBST(ss);
    }
    
private:
    TreeNode* buildBST(istringstream& ss) {
        string s;
        ss >> s;
        if (s == "null")
			return NULL;
        TreeNode* node = new TreeNode(stoi(s));
        node->left = buildBST(ss);
        node->right = buildBST(ss);          
        return node;
    }
};
*/