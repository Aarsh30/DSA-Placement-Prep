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

class Pairs
{
    TreeNode node;
    int num;
    Pairs(TreeNode _node,int _num)
    {
        num = _num;
        node =_node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     
        if(root == null)
            return 0;
        int ans=0;
        Queue<Pairs> q = new LinkedList<>();
        q.offer(new Pairs(root,0));
        while(!q.isEmpty())
        {
            int size = q.size();
            int min = q.peek().num;
            int first =0,last =0;
            for(int i=0;i<size;i++)
            {
                int cur_id = q.peek().num - min;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) first=cur_id;
                if(i==size-1) last = cur_id;
                if(node.left!=null)
                {q.offer(new Pairs(node.left,cur_id*2+1));
                }
                if(node.right!=null)
                {
                    q.offer(new Pairs(node.right,cur_id*2+2));
                }
            }
            ans =Math.max(last-first+1,ans);
        }
        return ans;
    }
}