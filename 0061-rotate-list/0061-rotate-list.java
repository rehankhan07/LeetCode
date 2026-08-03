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
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null || head.next == null || k==0) return head;
        ListNode temp = head;
        int n =1;
          while(temp.next!=null){
            n++;
            temp=temp.next;
        }
       temp=head;
        int rotation= k%n;
        for (int i = 0; i < rotation; i++) {
        ListNode prev = null;
         ListNode curr = head;

        while (curr.next != null) {
        prev = curr;
        curr = curr.next;
        }

       prev.next = null;
        curr.next = head;
       head = curr;
        }
    return head;
    }
}