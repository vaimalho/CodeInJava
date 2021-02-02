/*
 Reverse Linked List

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

package com.interview.microsoft;

public class ReverseLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	 
	public static void printList(ListNode head) {
		ListNode curr = head;
		
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	// Iterative
	public static void reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head;
		
		while(curr!=null) {
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		printList(prev);
	}
	
	// Recursive
	public static ListNode reverseList_Recur(ListNode head) {
		
		if(head.next == null) {
			return head;
		}
		
		ListNode curr = reverseList_Recur(head.next);
		head.next.next = head;
		head.next = null;
		
		return curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		printList(head);
		//reverseList(head);
		
		ListNode headNew = reverseList_Recur(head);
		printList(headNew);
	}

}
