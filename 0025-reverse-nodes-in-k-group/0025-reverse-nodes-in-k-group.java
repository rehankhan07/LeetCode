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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp = head;
        int gro= size/k;
        ListNode currhead= head;
        ListNode prevhead= null;
        ListNode ansnode = null;
        for(int i =0;i<gro;i++){
          ListNode prev= null;
          ListNode cur= currhead;
          ListNode nextnode= null;
          for(int j =0;j<k;j++){
            nextnode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextnode;
          }
          if(prevhead==null){
            ansnode=prev;
          }  
          else{ 
            prevhead.next = prev;

          }
          prevhead=currhead;
          currhead=cur;
        }
        prevhead.next = currhead;
        return ansnode;
    }
}