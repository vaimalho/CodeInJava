/*
# Palindrome Linked List

Solution
Given the head of a singly linked list, return true if it is a palindrome.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


Follow up: Could you do it in O(n) time and O(1) space?
 */
package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    static ListNode head;

    static class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
	    this.val = val;
	    this.next = null;
	}
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean isPalindrome(ListNode head) {

	List<ListNode> ls = new ArrayList<ListNode>();

	ListNode curr = head;

	while (curr != null) {
	    ls.add(curr);
	    curr = curr.next;
	}

	for (int i = 0, j = ls.size() - 1; i < ls.size() && j > 0; i++, j--) {

	    if (ls.get(i).val != ls.get(j).val)
		return false;
	}

	return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isPalindrome1(ListNode head) {

	ListNode firstHalf = endofFirstHalf(head);
	ListNode seconfHalf = reverseSeconfhalf(firstHalf.next);

	ListNode p1 = head;
	ListNode p2 = seconfHalf;

	while (p2 != null) {
	    if (p1.val != p2.val)
		return false;
	    p1 = p1.next;
	    p2 = p2.next;
	}
	return true;
    }

    private static ListNode reverseSeconfhalf(ListNode head) {
	// TODO Auto-generated method stub
	ListNode prev = null;
	ListNode curr = head;
	ListNode n = head;

	while (curr != null) {
	    n = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = n;
	}
	return prev;
    }

    private static ListNode endofFirstHalf(ListNode head) {
	// TODO Auto-generated method stub
	ListNode slow = head;
	ListNode fast = head;

	while (fast.next != null && fast.next.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}
	return slow;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	ListNode head = new ListNode(1);

	head.next = new ListNode(2);
	head.next.next = new ListNode(2);
	head.next.next.next = new ListNode(1);
	// head.next.next.next.next = new ListNode(4);
	// head.next.next.next.next.next = new ListNode(5);
	// head.next.next.next.next.next.next = new ListNode(6);

	System.out.println(isPalindrome(head));
    }

}
