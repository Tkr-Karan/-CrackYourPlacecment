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
    public static ListNode reverseLL(ListNode head){
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;


        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }
        return prev;
    }
        
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverseLL(slow.next);

        ListNode curr = head;

        while(rev != null){
            if(rev.val != curr.val) return false;

            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }

}