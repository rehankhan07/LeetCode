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
    public ListNode oddEvenList(ListNode head) {
        int count=0;
        ListNode odd= new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode odtemp=odd;
        ListNode eventemp=even;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=count;i++){
            if(i%2==0){
                even.next=temp;
                even=even.next;
            }
            else{
                odd.next=temp;
                odd=odd.next;
            }
            temp=temp.next;
        }
        odd.next=eventemp.next;
        even.next=null;

    return odtemp.next;
        
    }
}