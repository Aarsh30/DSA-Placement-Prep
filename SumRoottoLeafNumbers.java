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
class SumRoottoLeafNumbers {
    private int result;
    public int sumNumbers(TreeNode root) {
        if(root == null ) return 0;
        result = 0;
        findsum(root,0);
        return result;

    }
     
     private void findsum(TreeNode root , int val)
     {
         int curr = val*10+root.val;
         if(root.right == null && root.left == null)
         {
             result+=curr;
             return ;
         }
         if(root.right!=null) findsum(root.right,curr);
         if(root.left!=null) findsum(root.left,curr);
     }
}