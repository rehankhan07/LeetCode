/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n = arr.size()-1;
       return convert(arr,0,n);
    }
      public TreeNode convert(ArrayList<Integer> nums,int low, int high) {
        if(low>high) return null;
        int mid = low+(high-low)/2;
        TreeNode  root = new TreeNode (nums.get(mid));
       root.left= convert(nums,low,mid-1);
       root.right=convert(nums,mid+1,high);
       return root;
    }
}