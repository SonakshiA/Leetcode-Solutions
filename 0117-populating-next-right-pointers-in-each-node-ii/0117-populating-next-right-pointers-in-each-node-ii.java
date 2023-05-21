/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

//BFS approach

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        
        if(root==null){
            return root;
        }
        
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            Node pre = null;
            
            for(int i= 0 ;i<len; i++){
                Node temp = queue.poll();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                if(pre!=null){
                    pre.next = temp;
                }
                pre = temp;
            }
            pre.next=null;
        }
        return root;
    }
}