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
public int maxlength=0;

    public void solve(TreeNode root,int dir, int Currlength)
    {
        if(root==null)
        {
         return;
        }

        maxlength = Math.max(maxlength,Currlength);
        if(dir==1)
        {
            solve(root.left,0,Currlength+1);
            solve(root.right,1,1);
        }
        else{
        solve(root.right,1,Currlength+1);
        solve(root.left,0,1);

        }
    }


    public int longestZigZag(TreeNode root) {
        solve(root,0,0);
        solve(root,1,0);

        return maxlength;
        
    }
}