// Two Pointer Technique used:
// slow pointer traverses the linked list one step at a time
// fast pointer moves two steps ahead
// if a cycle exists, both pointers eventually meet

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class CycleDetection
 {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        
         while(fast!=null && fast.next != null )
         {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
             return true;

         } 
return false;           
    }
}