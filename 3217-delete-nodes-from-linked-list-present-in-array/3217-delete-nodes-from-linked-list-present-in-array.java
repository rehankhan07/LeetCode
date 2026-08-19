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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        ListNode res = new ListNode(0);
        ListNode rest = res;
        while(temp!=null){
            if(set.contains(temp.val)){
               temp=temp.next;
            }
            else{
                rest.next= temp;
                rest=rest.next;
                temp=temp.next;
            }
        }
        rest.next=null;
        return res.next;
    }
}