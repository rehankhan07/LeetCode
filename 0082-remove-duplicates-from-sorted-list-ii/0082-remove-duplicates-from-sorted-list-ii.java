
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    HashMap<Integer,Integer> map = new HashMap<>();
    ListNode temp = head;
    while(temp!=null){
        map.put(temp.val, map.getOrDefault(temp.val,0)+1);
        temp=temp.next;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    for(Map.Entry<Integer,Integer> e : map.entrySet()){
        int val= e.getKey();
        int rep=e.getValue();
        if(rep==1) arr.add(e.getKey());
    }
    Collections.sort(arr);
    ListNode dum= new ListNode(-1);
    ListNode d1=dum;
    for(int i =0;i< arr.size();i++){
        d1.next= new ListNode(arr.get(i));
        d1=d1.next;
    }
    return dum.next;

    }
}