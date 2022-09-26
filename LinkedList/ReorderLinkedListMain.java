/*
Reorder List

        You are given the head of a singly linked-list. The list can be represented as:

        L0 → L1 → … → Ln - 1 → Ln
        Reorder the list to be on the following form:

        L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
        You may not modify the values in the list's nodes. Only nodes themselves may be changed.



        Example 1:


        Input: head = [1,2,3,4]
        Output: [1,4,2,3]
        Example 2:


        Input: head = [1,2,3,4,5]
        Output: [1,5,2,4,3]


        Constraints:

        The number of nodes in the list is in the range [1, 5 * 104].
*/

package linkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReorderLinkedListMain {

    static ListNode head=null;
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {


        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);

        printList(head);
        reorderList(head);
    }

    public static void printList(ListNode head){
        ListNode curr = head;

        while(curr!=null){
            System.out.print(curr.val);
            curr=curr.next;
        }
        System.out.println();
    }


    // Time Complexity: O(N)
    // SPace Complexity: O(1)
    public static  void reorderList(ListNode head) {

        if(head==null || head.next==null)
            return;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;

        newHead = reverseList(newHead);

        ListNode curr = new ListNode(0);
        ListNode finalHead = curr;

        while(head!=null && newHead!=null){

            curr.next = head;
            curr=head;
            head=head.next;

            curr.next=newHead;
            curr=newHead;
            newHead=newHead.next;

        }
        curr.next=head;
        head = finalHead.next;
    }

    private static ListNode reverseList(ListNode newHead) {

        ListNode curr = newHead;
        ListNode nex = curr;

        ListNode prev = null;

        while(curr!=null){

            nex = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }

        return prev;
    }


}
