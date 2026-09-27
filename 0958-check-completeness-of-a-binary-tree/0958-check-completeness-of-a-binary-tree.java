
class Solution {
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        s=size(root);
       return iscbt(root,1);
    }
     public boolean iscbt(TreeNode root,int ind) {
       if(root==null) return true;
       if(ind>s) return false;
       return iscbt(root.left,2*ind)&&iscbt(root.right,2*ind+1);

    }
    public int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}