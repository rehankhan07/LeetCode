
class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
        TreeNode root = new TreeNode(pre[0]);
        for(int i=1;i< pre.length;i++){
            root= insert(root,pre[i]);
        }
        return root;
    }
    public TreeNode insert(TreeNode  root, int val){
        if(root==null) return new TreeNode (val);
        if(root.val > val){
            if(root.left==null) root.left= new TreeNode (val);
            else insert(root.left,val);
        }
        else {
             if(root.right==null) root.right= new TreeNode (val);
            else insert(root.right,val);
        }
        return root;
    }
}