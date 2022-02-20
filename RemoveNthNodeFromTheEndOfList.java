// Difficulty=Medium

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=findNthNode(null,head,n);
        
        return count==n?head.next:head;
    }
    
    public int findNthNode(ListNode prev, ListNode curr, int n){
        
        if(curr==null){
            return 0;
        }
        
        int count=findNthNode(curr,curr.next,n)+1;
        
        if(count==n && prev!=null){
            prev.next=curr.next;
        }
        return count;
    }
}

// Runtime=0ms
// Memory=42.5MB
