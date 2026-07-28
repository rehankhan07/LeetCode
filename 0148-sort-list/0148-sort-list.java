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
   // public ListNode create(int arr,int n){
       // ListNode new = new Listnode(-0);
        //ListNode temp=new;
      //  for(int i=0;i<arr.length;i++){
  //           ListNode new = new Listnode(arr[i]);
    //         temp=temp.next;
//
     //   }
   //     return new.next;
   // }
    public ListNode sortList(ListNode head) {
        int count=0;
        ListNode temp= head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr= new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        temp=head;
        Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        temp.val=arr[i];
        temp=temp.next;
       }
       return head;
    }
}