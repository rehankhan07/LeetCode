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
    public ListNode insertionSortList(ListNode head) {
       int count=0;
       ListNode temp = head;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       temp = head;
       int [] arr = new int [count];
       int idx=0;
        while(temp!=null){
        arr[idx]=temp.val;
        temp=temp.next;
        idx++;
       }
       Arrays.sort(arr);
       ListNode res = new ListNode(-1);
       ListNode rest = res;
       for(int i=0;i<arr.length;i++){
        rest.next= new ListNode(arr[i]);
        rest=rest.next;
       }
       return res.next;
    }
}