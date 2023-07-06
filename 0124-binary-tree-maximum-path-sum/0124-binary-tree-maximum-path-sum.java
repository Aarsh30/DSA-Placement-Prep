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
    public int maxPathSum(TreeNode root) {
        int maxValue[] = new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPathRoot(root,maxValue);
        return maxValue[0];
    }
    
    private int maxPathRoot(TreeNode node, int maxValue[])
    {
        if(node == null)
            return 0;
        int left = Math.max(0,maxPathRoot(node.left,maxValue));
        int right = Math.max(0,maxPathRoot(node.right,maxValue));
        
        maxValue[0]=Math.max(maxValue[0],left+right +node.val);
        return Math.max(left,right) + node.val;
    }
}