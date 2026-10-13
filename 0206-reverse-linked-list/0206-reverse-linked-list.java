
class Solution {
    public ListNode reverseList(ListNode head) {
    //   ListNode curr=head;
    //    ListNode pre=null;
    //     ListNode after=null;
    //     while(curr!=null){
    //         after=curr.next;
    //         curr.next=pre;
    //         pre=curr;
    //         curr=after;
    //     }
    //     return pre;
    if(head==null) return null;
    Stack<ListNode> st = new Stack<>();
    ListNode temp = head;
    while(temp!=null){
        ListNode push=  temp;
        st.push(push);
        temp=temp.next;
    }
    ListNode res = st.pop();
    ListNode op= res;
    while(!st.isEmpty()){
    op.next=st.pop();
    op=op.next;
    }
    op.next=null;
    return res;
    }
}