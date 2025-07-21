/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 This implementation uses recursion to:

Compare the head nodes (list1.val and list2.val),

Attach the smaller node to the result,

Recur with the next node from that list and the current node from the other list.
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //check if either lists or NULL
        if(list1 != null && list2 != null) {

            //if the first value of list 1 is less than 2
            if(list1.val < list2.val) {
                
                //set the next index of list 1 equal to recalling the merge function with the current list 2 index and list1.next
                list1.next = mergeTwoLists(list1.next,list2);

                // return list1 
                return list1; 
            } else {

                //set the next index of list 2 equal to recalling the merge function with the current list 1 index and list2.next
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        
        //if list1 is empty return list2
        if(list1 == null) {
            return list2;
        }

        //return lsit if both list1 or list2
        return list1;
    }
}
