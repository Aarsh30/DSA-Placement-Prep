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
class NodeValue{
    public int maxValue,minValue,maxsum;
    NodeValue(int max, int min,int maxsum){
        this.maxValue = max;
        this.minValue = min;
        this.maxsum = maxsum;
    }
}

class Solution {
    int max = 0;
    public NodeValue maxSumBSTHelper(TreeNode root){
        //An empty tree or bst of size 0;
        if(root == null){
            return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        }
        NodeValue left = maxSumBSTHelper(root.left);
        NodeValue right = maxSumBSTHelper(root.right);
        
        //Check if it's a valid bst
        if(left.maxValue < root.val && root.val < right.minValue){
            //It is a BST , calculate maxsum tillnow.
             max = Math.max(max,root.val + left.maxsum + right.maxsum);
            return new NodeValue(Math.max(root.val,right.maxValue), Math.min(root.val,left.minValue),root.val+left.maxsum + right.maxsum);
           
        }
        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxsum,right.maxsum));
    }
    public int maxSumBST(TreeNode root) {
        maxSumBSTHelper(root);
        return max;
    }
}