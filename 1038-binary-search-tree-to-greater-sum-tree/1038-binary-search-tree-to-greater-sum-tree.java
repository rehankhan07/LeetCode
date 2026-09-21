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
    static int k;
    public TreeNode bstToGst(TreeNode root) {
       ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        int[] num = new int [arr.size()];
        int a=0;
        int l=0;
        for(int i = arr.size()-1;i>=0;i-- ){
          a+=arr.get(i);
          num[i]=a;
        }
        k=0;
        in(root,arr,num);
        return root;  
    }
     public void in(TreeNode root,  ArrayList<Integer> arr,int[] num ){
     if(root==null) return ;
     in(root.left,arr,num);
     root.val=num[k];
     k++;
     in(root.right,arr,num);
    }
    public void inorder(TreeNode root,  ArrayList<Integer> arr ){
     if(root==null) return ;
     inorder(root.left, arr);
     arr.add(root.val);
     inorder(root.right, arr);
    }
}