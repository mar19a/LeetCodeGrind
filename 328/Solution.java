/* 
    Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * 
 */

 class Solution {
    public ListNode oddEvenList(ListNode head) {
        ArrayList<ListNode> newarr = new ArrayList<>();
        ListNode temp = head;

        while(temp != null) {
            newarr.add(temp);
            temp = temp.next;
        }

        ListNode dummyHead = new ListNode(0);
        temp = dummyHead;
        
        // First pass for the odd nodes
        for(int i = 0; i < newarr.size(); i += 2) {
            temp.next = newarr.get(i);
            temp = temp.next;
        }
        
        // Second pass for the even nodes
        for(int j = 1; j < newarr.size(); j += 2) {
            temp.next = newarr.get(j);
            temp = temp.next;
        }

        // Make sure the last node's next is null
        temp.next = null;

        return dummyHead.next;
    }
}