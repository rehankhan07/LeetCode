
class Solution {
    public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    return  isSameTree(root.left,root.right);
    }
     public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null|| q==null) return p==q;
     if (p.val != q.val) {
            return false;
        }
    boolean l =  isSameTree( p.left,  q.right);
    boolean r =  isSameTree( p.right,  q.left);
    return l&&r;
    }
     
}