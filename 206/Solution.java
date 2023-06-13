/*
    Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


 * 
 */


 class Solution {
    public ListNode reverseList(ListNode head) {
 ListNode rev = null;
        
        
        while(head!= null)
        {
            ListNode next_node = head.next;
            head.next = rev;
            rev = head;
            head = next_node;
            

            
            
            
            /* prev head  next_node                           */
            /* null <- 1 ->    2 ->  3 -> 4 -> 5 */
        }
        return rev;
    }
}