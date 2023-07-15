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

//     public static void tree(TreeNode root, List<Integer> list)
//     {
//         if(root == null)
//             return;
//        tree(root.left,list);
//        list.add(root.val);
//        tree(root.right,list);

//     }


//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         tree(root,list);
//         return list;
//     }
// }
    
//     public static void tree(TreeNode root, List<Integer> list)
//     {
        
//         if(root == null) return;
       
//         Queue<TreeNode> q = new LinkedList<TreeNode>();
//         q.add(root);
//         while(q.isEmpty()==false)
//         {
//             int count = q.size();
//             for(int i=0;i<count;i++)
//             {TreeNode curr = q.poll();
//             if(i==0)
//              list.add(curr.val);
//             if(curr.left !=null)
//                     q.add(curr.left);
//              if(curr.right != null)
//                  q.add(curr.right);
            
//             }
//         }
        
//     }
    
//    public List<Integer> inorderTraversal(TreeNode root)
//    {
//        List<Integer> list = new ArrayList<>();
//        tree(root,list);
//        return list;
//    }
// }
 public List<Integer> inorderTraversal(TreeNode root)
 {
     List<Integer> inorder = new ArrayList<>();
     TreeNode curr = root;
     while(curr!=null)
     {
         if(curr.left == null)
         {
             inorder.add(curr.val);
             curr= curr.right;
         }
         else
         {
             TreeNode prev = curr.left;
             while(prev.right!=null && prev.right!=curr)
             {
                 prev = prev.right;
             }
             if(prev.right== null)
             { prev.right= curr;
              curr= curr.left;
              }
             else
             {
                 prev.right = null;
                inorder.add(curr.val);
                 curr= curr.right;
             }
         }
        
     }
      return inorder;
 }
}