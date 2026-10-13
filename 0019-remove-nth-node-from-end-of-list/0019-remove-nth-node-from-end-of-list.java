
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int idx) {
    if(head==null) return null;
    if(head.next==null&& idx==1) return null;
    int count =0;
    ListNode temp = head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
     if (count == idx) {
            return head.next;
        }
    temp=head;
    for(int i=0;i< count-idx-1;i++){
      temp=temp.next;
    }
    temp.next=temp.next.next;
     return head;
}
   }
   