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
//     public static void tree(TreeNode root, List<Integer> l)
//     {
//         if(root == null)
//         return;
//         l.add(root.val);
//         tree(root.left,l);
//         tree(root.right,l);
//     }


//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         tree(root,list);
//         return list;
//     }
    public static void tree(TreeNode root, List<Integer> list)
    {
        
        if(root == null) return;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
      //  List<Integer> ans = new ArrayList
        while(st.isEmpty()==false)
        {
            TreeNode curr = st.pop();
            list.add(curr.val);
            if(curr.right!=null)
                st.push(curr.right);
            if(curr.left!=null)
                st.push(curr.left);
        }
        
    }
    
   public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        tree(root,list);
        return list;
    }
}