/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (node.neighbors.size() == 0) {
            return new Node(node.val);
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Map<Node, Node> map = new HashMap<Node, Node>();
        map.put(node, new Node(node.val));
        while (!q.isEmpty()) {
            Node u = q.poll();
            Node clonedU = map.get(u);
            if (u.neighbors != null) {
                List<Node> list = u.neighbors;
                for (Node n : list) {
                    Node cloned = map.get(n);
                    if (cloned == null) {
                        q.add(n);
                        cloned = new Node(n.val);
                        map.put(n, cloned);
                    }
                    clonedU.neighbors.add(cloned);
                }
            }
        }
        return map.get(node);
    }
}

// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3501/

// https://www.geeksforgeeks.org/clone-an-undirected-graph/#:~:text=The%20idea%20is%20to%20do,already%20has%20a%20clone%20node.