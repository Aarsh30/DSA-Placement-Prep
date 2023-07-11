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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        dfsBuild(root, null,graph);
        List<Integer> answer = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<int[]> queue= new LinkedList<>();
        
        queue.add(new int[]{target.val,0});
        visited.add(target.val);
        
        while(!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int node = curr[0],distance = curr[1];
            
            
            if(distance ==k)
            {
                answer.add(node);
                continue;
            }
            
            for(int neighbor : graph.getOrDefault(node, new ArrayList<>()))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    queue.add(new int[]{neighbor,distance +1});
                }
            }
        }
        return answer;
        
    }
    
    private void dfsBuild(TreeNode curr,TreeNode parent, Map<Integer,List<Integer>> graph)
    {
        if(curr != null && parent != null)
        {
            int curVal = curr.val,parentVal = parent.val;
            graph.putIfAbsent(curVal, new ArrayList<>());
            graph.putIfAbsent(parentVal, new ArrayList<>());
            graph.get(curVal).add(parentVal);
            graph.get(parentVal).add(curVal);
        }
        if(curr != null && curr.left !=null)
        {
            dfsBuild(curr.left,curr,graph);
        }
         if(curr != null && curr.right !=null)
        {
            dfsBuild(curr.right,curr,graph);
        }
    }
}