class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        int index = 0;
        while(temp != null){
            arr[index] = temp.val;
            index++;
            temp = temp.next;
        }
        int le = left - 1;
        int ri = right - 1;
        while(le < ri){
            int tmp = arr[le];
            arr[le] = arr[ri];
            arr[ri] = tmp;

            le++;
            ri--;
        }
        ListNode dummy = new ListNode(-1);
        ListNode dn = dummy;
        for(int i = 0; i < arr.length; i++){
            ListNode res = new ListNode(arr[i]);
            dn.next = res;
            dn = dn.next;
        }
        return dummy.next;
    }
}