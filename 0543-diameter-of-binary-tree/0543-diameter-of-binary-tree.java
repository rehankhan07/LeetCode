
class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        level(root);
        return max;
    }
    public int level(TreeNode root){
        if(root==null) return 0;
        int l= level(root.left);
        int r= level(root.right);
        max=Math.max(max,l+r);
        return 1+Math.max(l,r);
    }
}