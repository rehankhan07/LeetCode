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
    public ListNode mergeKLists(ListNode[] lists) {
     ArrayList<ListNode> arr = new ArrayList<>();

        for (ListNode head : lists) {
            while (head != null) {
                arr.add(head);
                head = head.next;
            }
        }
        Collections.sort(arr, (a, b) -> a.val - b.val);

    ListNode dummy = new ListNode(-1);
    ListNode temp = dummy;
   for (ListNode node : arr) {
            temp.next = node;
            temp = temp.next;
        }

    temp.next = null;
         return dummy.next;
    }
}