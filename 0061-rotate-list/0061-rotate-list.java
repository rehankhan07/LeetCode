
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null || head.next == null || k==0) return head;
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        temp=head;
        int n = arr.size();
        k= k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        ListNode dummy= new ListNode(-1);
        ListNode d1= dummy;
        for(int i =0;i< arr.size();i++){
            d1.next= new ListNode(arr.get(i));
            d1=d1.next;
        }
        return dummy.next;
    }
    public void reverse(ArrayList<Integer> arr , int l ,int r){
        while(l<r){
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r,temp);
           l++;
           r--;
        }
    }
}