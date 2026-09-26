
class Solution {
     static int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        level(root);
        return max;
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        int l= level(root.left);
        int r= level(root.right);
        l = Math.max(0, l);
        r = Math.max(0, r);
        max=Math.max(max,l+r+root.val);
        return root.val+Math.max(l,r);
    }
}