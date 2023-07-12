​public int count(TreeNode root)
{
if(root == null)
return;

return 1+count(root.left)+count(root.right);
