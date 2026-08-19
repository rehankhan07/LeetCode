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
    public int[] nextLargerNodes(ListNode head) {
      Stack<Integer> st = new Stack<>();
      int count =0;
      ListNode temp = head;
      while(temp!=null){
        count++;
        temp=temp.next;
      }
      temp=head;
      int[] arr = new int[count];
       int index =0;
    //   ListNode temp = head;
      while(temp!=null){
        arr[index]=temp.val;
         index++;
        temp=temp.next;
       
      }
      temp = head;
       int[] res = new int[count];
       for(int i=count-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=arr[i]){
            st.pop();
           }
           if(st.isEmpty()) res[i]=0;
           else{
            res[i]=st.peek();
           }   
          st.push(arr[i]);   
       }
       return res;
    //    ListNode tee = new ListNode(0);
    //    ListNode tep= tee;
    //    for(int i=0;i<res.length;i++){
    //     ListNode x = new ListNode(arr[i]);
    //     tee.next = x;
    //     tee = tee.next;
    //    }


    // return tep.next;
        
    }
}