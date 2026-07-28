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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr= new int [count];
        for(int i=0;i<count;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        temp=head;
        int i=0;
        int j=count-1;
        while(i<j){
            int temppp=arr[i];
            arr[i]=arr[j];
            arr[j]=temppp;
            i++;
            j--;
        }
        int k=0;
       while(k<count){
       if(temp.val!=arr[k]){
        return false;
       }
       temp=temp.next;
       k++;
       }
        
    return true;
    }
}