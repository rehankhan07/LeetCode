
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ArrayList<Integer> arr = new ArrayList<>();
        while(t1!=null){
            arr.add(t1.val);
            t1=t1.next;
        }
         while(t2!=null){
            arr.add(t2.val);
            t2=t2.next;
        }
        Collections.sort(arr);
        ListNode dum= new ListNode(-1);
        ListNode d1= dum;
        for(int  i =0;i< arr.size();i++){
            d1.next = new ListNode(arr.get(i));
            d1 = d1.next;                    
        }
    return dum.next;
    }
}