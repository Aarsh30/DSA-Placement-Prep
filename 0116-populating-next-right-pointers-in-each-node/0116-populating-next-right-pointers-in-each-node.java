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

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;        
        link(root.left,root.right);
        return root;
    }
    
    public void link(Node left, Node right)
    {
        if(left==null&&right ==null) return;
        
        left.next=right;
        link(left.left,left.right);
        link(left.right,right.left);
        link(right.left,right.right);
    }
}