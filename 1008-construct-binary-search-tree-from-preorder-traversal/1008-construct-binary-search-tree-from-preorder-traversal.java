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
//     public TreeNode bstFromPreorder(int[] preorder) {
//       TreeNode root = new TreeNode(preorder[0]);
//         for(int i :  preorder)
//         {
//             build(i,root);
//         }
        
//         return root;
        
//     }
    
//     public TreeNode build(int i,TreeNode root)
//     {
//         if(root == null)
//         {
//             root = new TreeNode(i);
//             return root;
//         }
//         if(i<root.val)
//         {
//             root.left = build(i,root.left);
            
//         }
//         if(i>root.val)
//         {
//             root.right = build(i,root.right);
//         }
        
//         return root;
//     }
// }
    
public TreeNode bstFromPreorder(int[]a)
{
    return bstfromPreorder(a,Integer.MAX_VALUE,new int[] {0});
}
    
    public TreeNode bstfromPreorder(int[]a, int bound, int[]i)
    {
        if(i[0]==a.length ||a[i[0]]>bound)
            return null;
        
        TreeNode root = new TreeNode(a[i[0]++]);
        root.left = bstfromPreorder(a,root.val,i);
        root.right = bstfromPreorder(a,bound,i);
        return root;
    }
}