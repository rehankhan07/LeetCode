
class Solution {
    int sum=0;
   public int sumNumbers(TreeNode root) {
      pre(root,0);
      return sum;  
    }
    public void pre(TreeNode root,int curr){
    if(root==null) return;
    curr= curr*10+root.val;
    if(root.left==null && root.right==null) {
        sum+=curr;
        return;
    }
    pre(root.left, curr);
    pre(root.right, curr);
    }
}