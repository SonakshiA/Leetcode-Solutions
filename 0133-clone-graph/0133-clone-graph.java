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
    HashMap<Node,Node> vis = new HashMap<>();
    
    private Node dfs(Node node){
        if(node==null)
            return node;
    
        if(vis.containsKey(node)) 
            return vis.get(node);

        Node newNode = new Node(node.val);
        vis.put(node,newNode);

        for(Node edge: node.neighbors){
            newNode.neighbors.add(dfs(edge));
        }
        return newNode;
    }

    public Node cloneGraph(Node node) {
            Node clone=dfs(node);
            return clone;
    }
}