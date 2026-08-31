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
        st.push(temp);
        temp=temp.next;
    }
    ListNode res = st.pop();
    ListNode temp2= res;
    while(!st.isEmpty()){
        temp2.next=st.pop();
        temp2=temp2.next;
    }
    temp2.next=null;
    return res;
    }
}