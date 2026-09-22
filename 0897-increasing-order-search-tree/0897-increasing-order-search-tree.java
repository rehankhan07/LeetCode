
class Solution {
      TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode root1 = new TreeNode(0);
        curr = root1;
        in(root);
        return root1.right;
    }
    public void in(TreeNode root) {
        if (root == null) return;
        in(root.left);
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        in(root.right);
    }
}