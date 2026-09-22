/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        Collections.sort(arr);
          int[] idx = {0};
        in(root,arr,idx);
    }
      public void in(TreeNode root, ArrayList<Integer> arr ,int[] idx){
        if(root==null) return;
          in(root.left,arr,idx);
         root.val=arr.get(idx[0]);
         idx[0]++;
          in(root.right,arr,idx);

    }
    public void inorder(TreeNode root, ArrayList<Integer> arr ){
        if(root==null) return;
          inorder(root.left,arr);
          arr.add(root.val);
          inorder(root.right,arr);

    }
}