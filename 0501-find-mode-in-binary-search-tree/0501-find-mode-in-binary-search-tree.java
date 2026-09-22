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
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        in(root,arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++){
           if(map.containsKey(arr.get(i))){
              map.put(arr.get(i), map.get(arr.get(i)) + 1);
             }
            else map.put(arr.get(i),1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int maxFreq = 0;
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          maxFreq = Math.max(maxFreq, entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
           res.add(entry.getKey());
           }
        }
        int[] num = new int[res.size()];
        for(int i =0;i< res.size();i++){
            num[i]= res.get(i);
        }
    return num;

    }
    public void in(TreeNode root, ArrayList<Integer> arr ){
        if(root==null) return;
        in(root.left,arr);
        arr.add(root.val);
        in(root.right,arr);
    }
}