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
    public void reorderList(ListNode head) {
    
        ArrayList<Integer> newarraylist = new ArrayList<>();
        
        ListNode temp = head;
        
        while(temp != null)
        {
            newarraylist.add(temp.val);
            temp = temp.next;
        }
        
        
        //[1, 2, 3, 4]
        int start = 0;
        int end = newarraylist.size()-1;
        
        ListNode newtemp = head;
        temp = head;
        while(start < end) {
            temp.val = newarraylist.get(start++);
            temp = temp.next;
            temp.val = newarraylist.get(end--);
            if (temp != null) {
                temp = temp.next;
            }
        }

        if (start == end) {
            temp.val = newarraylist.get(start);
        }
        

        
    }
}