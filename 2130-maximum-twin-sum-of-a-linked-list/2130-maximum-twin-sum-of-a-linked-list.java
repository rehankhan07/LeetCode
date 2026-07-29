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
    public int pairSum(ListNode head) {
     ListNode temp=head;
     int count=0;
     while(temp!=null){
        count++;
        temp=temp.next;
     }
     temp=head;
    int [] arr= new int [count];
    for(int i=0;i<arr.length;i++){
        arr[i]=temp.val;
        temp=temp.next;
    }
    int left=0;
    int right=count-1;
     int sum=0;
    while(left<right){
       
        if(arr[left]+arr[right]>sum){
            sum=arr[left]+arr[right];
        }
        left++;
        right--;

    }
    return sum;
    }
    
}