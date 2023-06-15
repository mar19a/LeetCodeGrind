/*
  Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 * 
 */

 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> newarraylist = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null) {
            newarraylist.add(temp);
            temp = temp.next;
        }
        
        int removeIndex = newarraylist.size() - n;
        // Check if the head node is being removed
        if(removeIndex == 0) {
            // If so, we need to return the second node as the new head.
            return head.next;
        }
        else {
            ListNode prevNode = newarraylist.get(removeIndex - 1);
            // If the node to be removed is not the last one, set the next of the previous node to the node after the one to be removed.
            if(removeIndex < newarraylist.size() - 1) {
                prevNode.next = newarraylist.get(removeIndex + 1);
            }
            // If it's the last node, set the next of the previous node to null.
            else {
                prevNode.next = null;
            }
            return head;
        }
    }
}