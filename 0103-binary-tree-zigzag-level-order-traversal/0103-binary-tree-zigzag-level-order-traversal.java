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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
      if(root == null)
      {return ans;
      }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        boolean isLeft = true;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<Integer>(size);
            for(int i=0;i<size;i++)
            {
                temp.add(0);
            }
            int index =0;
            while(size!=0)
            {
                TreeNode node = queue.poll();
                if(isLeft)
                {
                    temp.set(index++,node.val);
                }
                else
                {
                    temp.set(size -1,node.val);
                }
                if(node.left !=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                size--;
            }
            ans.add(temp);
            isLeft = !isLeft;
        }
        
        return ans;
    }
}