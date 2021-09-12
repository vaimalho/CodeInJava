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
	
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode curr = head;
		int size=0;
		while(curr!=null) {
			curr=curr.next;
			size++;
		}
		
		int index = size-n;
		if(index<0) {
			return head;
		}
		if(index==0) {
			head=head.next;
			return head;
		}
			
		curr=head;
		for(int i=1; i<index; i++) {
			curr=curr.next;
		}
		
		curr.next=curr.next.next;
		return head;

	}
	
	public static ListNode removeNthFromEnd2(ListNode head, int n) {
		
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode first = dummy;
		ListNode second = dummy;
		
		for(int i=0 ; i<=n; i++) {
			first=first.next;
		}
		while(first!=null) {
			first=first.next;
			second=second.next;
		}
		second.next = second.next.next;
		return dummy.next;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		removeNthFromEnd2(head,2);
	}

}
