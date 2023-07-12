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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     Map<Integer,Integer> imap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            imap.put(inorder[i],i);
            
        }
        
        TreeNode root = buildMap(preorder,0,preorder.length-1,inorder,0,inorder.length-1,imap);
            
       return root;     
    }
    
    
    public TreeNode buildMap(int[] preorder,int pstart,int pend,int[]inorder,int istart,int iend,Map<Integer,Integer>imap)
    {
        if(pstart > pend || istart > iend) return null;
        TreeNode root = new TreeNode(preorder[pstart]);
        int inRoot = imap.get(root.val);
        int numsLeft = inRoot - istart;
        
        root.left = buildMap(preorder,pstart+1,pstart+numsLeft,inorder,istart,inRoot-1,imap);
        
        root.right = buildMap(preorder,pstart + numsLeft +1,pend,inorder,inRoot+1,iend,imap);
        
        
        return root;
            
            
            
            
    }
}