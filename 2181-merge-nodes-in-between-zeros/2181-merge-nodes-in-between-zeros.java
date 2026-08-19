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
    public ListNode mergeNodes(ListNode head) {
        ArrayList <Integer> arr = new ArrayList<>();
        ListNode temp = head;
         int sum=0;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }
            else{
                 arr.add(sum);
                  sum=0;
                }
            temp=temp.next;
        }
       temp=head;
       int [] res = new int [arr.size()];
       for(int i=0;i<arr.size();i++){
        res[i]=arr.get(i);
       }
       ListNode ge = new ListNode(0);
       ListNode ge1= ge;
       for(int i=0;i<res.length;i++){
        ListNode x = new ListNode(res[i]);
        ge.next = x;
        ge = ge.next;
       }
      return ge1.next.next;  
    }
}