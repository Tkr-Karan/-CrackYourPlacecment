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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        if(head == null) return head;
        
        
        ListNode curr = head;
        int count = 0;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        
        while(fast != null && fast.next != null){
            if(count % 2 == 0){
                head = slow.next;
            }else{
                head = slow.next;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return head;
    }
}