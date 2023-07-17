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
        if(node == null) return null;
        
        Node graph = new Node(node.val);
        
        HashMap<Node,Node> mp = new HashMap<>();
        mp.put(node,graph);
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while(!queue.isEmpty())
        {
            Node cur = queue.poll();
            for(Node val:cur.neighbors)
            {
                if(!mp.containsKey(val))
                {
                    mp.put(val,new Node(val.val));
                    queue.offer(val);
                }
                mp.get(cur).neighbors.add(mp.get(val));
            }
        }
        
        return graph;
        
    }
}