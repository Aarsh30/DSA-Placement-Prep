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
    public TreeNode bstFromPreorder(int[] preorder) {
      TreeNode root = new TreeNode(preorder[0]);
        for(int i :  preorder)
        {
            build(i,root);
        }
        
        return root;
        
    }
    
    public TreeNode build(int i,TreeNode root)
    {
        if(root == null)
        {
            root = new TreeNode(i);
            return root;
        }
        if(i<root.val)
        {
            root.left = build(i,root.left);
            
        }
        if(i>root.val)
        {
            root.right = build(i,root.right);
        }
        
        return root;
    }
}