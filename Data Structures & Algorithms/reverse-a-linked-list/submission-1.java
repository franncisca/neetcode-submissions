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
    public ListNode reverseList(ListNode head) {
        //Review 1
        //     1 -> 2 -> 3 -> null
        //prev curr
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            //Save the reste nodes of linked list
            ListNode temp = curr.next;
            //Reverse next to prev
            curr.next = prev;
            //Move prev to curr
            prev = curr;
            //Move curr to next node
            curr = temp;
        }
    
        return prev;
    }
}
