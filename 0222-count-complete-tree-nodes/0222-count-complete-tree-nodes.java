
class Solution {
    public int countNodes(TreeNode root) {
     int l=  rightd(root);
     int r=  leftd(root);
     if(l==r){
        return (int) Math.pow(2,l)-1;
     }
     else
        return 1+countNodes(root.left)+countNodes(root.right);
     
    }
    public int rightd(TreeNode root){
     int dep=0;
     while(root!=null){
        root=root.right;
        dep++;
     }
     return dep;
    }
    public int leftd(TreeNode root){
     int dep=0;
     while(root!=null){
        root=root.left;
        dep++;
     }
     return dep;
    }
}