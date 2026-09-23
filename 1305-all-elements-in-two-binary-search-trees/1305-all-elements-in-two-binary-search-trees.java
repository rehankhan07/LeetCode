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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr = new ArrayList<>();
        in(root1,arr);
        in(root2,arr);
        Collections.sort(arr);
        return arr;
    }
    public void in(TreeNode root,  ArrayList<Integer> arr ){
    if(root==null) return ;
     in(root.left,arr);
     arr.add(root.val);
      in(root.right,arr);
    }
}