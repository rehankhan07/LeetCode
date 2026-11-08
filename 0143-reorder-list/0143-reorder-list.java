
class Solution {
    public void reorderList(ListNode head) {
    int count =0;
    ListNode temp = head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    temp = head;
    for(int i=0;i<count/2;i++){
        temp=temp.next;
    }
    Stack<ListNode> st = new Stack<>();
    while(temp!=null){
        st.push(temp);
        temp=temp.next;
    }
    temp = head;
     ListNode curr = head;
        for(int i = 0; i < count / 2; i++) {
            ListNode next = curr.next;
            ListNode node = st.pop();
            curr.next = node;
            node.next = next;
            curr = next;
        }
        curr.next = null;
    }
}