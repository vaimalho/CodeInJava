/*
141. Linked List Cycle

        Given head, the head of a linked list, determine if the linked list has a cycle in it.

        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
        Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

        Return true if there is a cycle in the linked list. Otherwise, return false.

        Example 1:


        Input: head = [3,2,0,-4], pos = 1
        Output: true
        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
        Example 2:


        Input: head = [1,2], pos = 0
        Output: true
        Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
        Example 3:


        Input: head = [1], pos = -1
        Output: false
        Explanation: There is no cycle in the linked list.

*/

package top145questions;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle_141 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head.next.next.next.next = head.next.next;
        System.out.println(hasCycle_Optimized(head));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean hasCycle(ListNode head) {

        if(head==null || head.next==null)
            return false;

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while(curr!=null){
            if(set.contains(curr))
                return true;
            set.add(curr);
            curr=curr.next;
        }

        return false;

    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean hasCycle_Optimized(ListNode head) {

        if(head==null || head.next==null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                return true;
        }
        return false;
    }
}
