class Solution {
    
    public static void tree(TreeNode root, List<List<Integer>> list) {
        if (root == null)
            return;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> levelValues = new ArrayList<>(); // Create a new list for each level
            
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                levelValues.add(curr.val); // Add the value to the level list
                
                if (curr.left != null)
                    q.add(curr.left);
                
                if (curr.right != null)
                    q.add(curr.right);
            }
            
            list.add(levelValues); // Add the level list to the main list
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        tree(root, list);
        return list;
    }
}
