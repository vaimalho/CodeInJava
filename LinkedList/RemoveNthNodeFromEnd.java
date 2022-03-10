/*
#Remove Nth Node From End of List

Solution
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
 */

package linkedlist;

public class RemoveNthNodeFromEnd {

    static class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
	    val = x;
	    next = null;
	}
    }

    // Two Pass Algorithm
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static ListNode removeNthFromEnd(ListNode head, int n) {

	ListNode curr = head;
	int len = 0;
	int diff = 0;

	while (curr != null) {
	    len++;
	    curr = curr.next;
	}
	curr = head;

	diff = len - n;

	if (diff == 0) {
	    return head.next;
	}
	if (diff > 0) {
	    for (int i = 0; i < diff - 1; i++) {
		curr = curr.next;
	    }
	    curr.next = curr.next.next;
	}

	return head;

    }

    // One Pass Algorithm
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static ListNode removeNthFromEnd2(ListNode head, int n) {

	// move current node to n
	ListNode currNode = head;

	for (int i = 0; i < n; i++) {
	    currNode = currNode.next;
	}

	if (currNode == null)
	    return head.next;

	ListNode nodeBeforeN = head;

	while (currNode.next != null) {
	    nodeBeforeN = nodeBeforeN.next;
	    currNode = currNode.next;
	}

	nodeBeforeN.next = nodeBeforeN.next.next;

	return head;

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(5);

	removeNthFromEnd2(head, 2);
    }

}
