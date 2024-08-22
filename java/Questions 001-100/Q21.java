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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head, answerList;
        if (list1 == null && list2 == null) {return null;}
        else if (list1 != null && list2 != null) {
            // Define head here
            if (list1.val < list2.val){
                head = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                head = new ListNode(list2.val);
                list2 = list2.next;
            }
            answerList = head;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val){
                    answerList.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else {
                    answerList.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                answerList = answerList.next;
            } 

            // Check for possible leftovers, add at the end of answerlist
            while (list1 != null) {
                answerList.next = new ListNode(list1.val);
                list1 = list1.next;
                answerList = answerList.next;
            }
            while (list2 != null) {
                answerList.next = new ListNode(list2.val);
                list2 = list2.next;
                answerList = answerList.next;
            }

            return head;
        }
        else {return (list1 == null) ? list2 : list1;} 
    }
}