
class Solution {
    public ListNode sortList(ListNode head) {
       ListNode  temp = head;
       ArrayList<Integer> arr = new ArrayList<>();
       while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
       }
       Collections.sort(arr);
       ListNode dum= new ListNode (-1);
       ListNode d1= dum;
       for(int i =0;i< arr.size();i++){
        d1.next= new ListNode (arr.get(i));
        d1=d1.next;
       }
       return dum.next;
    }
}