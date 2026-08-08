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
    public ListNode removeElements(ListNode head, int val) {
    ListNode res = new ListNode(0);
    ListNode tempres= res;
     ListNode temp= head;
    while(temp!=null){
        if(temp.val==val){ 
            tempres.next = temp.next;
        // temp=temp.next;
        }     
        else{
         tempres.next= temp;
         tempres=tempres.next;
        //  temp=temp.next;
        }
        temp = temp.next;
    }

     return res.next;
    }
}