/*

21. Merge Two Sorted Lists
        You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.

        Example 1:

        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]
*/

package top145questions;

public class MergeTwoSortedLists_21 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;

        while(curr!=null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode newHead = mergeTwoLists(list1, list2);
        printList(newHead);

    }

    // Time Complexity: O(L1 + L2)
    // Space Complexity: O(1)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                p.next = list1;
                p = list1;
                list1 = list1.next;
            }
            else{
                p.next = list2;
                p = list2;
                list2 = list2.next;
            }
        }

        p.next = list1 == null ? list2 : list1;
        return dummy.next;

    }
}
