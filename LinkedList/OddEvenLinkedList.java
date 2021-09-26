/*
# Odd Even Linked List

Add to List

Share
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
*/

package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {

	
	static ListNode head;
	static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	public static ListNode oddEvenList(ListNode head) {
		
		if(head==null || head.next==null)
			return head;
		
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenTemp = even;
		
		// Logic 1
		
//		while(odd.next!=null && odd.next.next!=null) {
//			odd.next = odd.next.next;
//			evenTemp.next = evenTemp.next.next;
//			odd = odd.next;
//			evenTemp=evenTemp.next;
//		}
		
		while(evenTemp!=null && evenTemp.next!=null) {
			odd.next = evenTemp.next;
			odd = odd.next;
			evenTemp.next = odd.next;
			evenTemp = evenTemp.next;
		}
		
		odd.next = even;

		
		return head;
	}
	
	public static ListNode oddEvenList1(ListNode head) {


		if(head==null || head.next==null)
			return head;

		ListNode odd = head;
		ListNode even = head.next;

		List<Integer> oddList = new ArrayList<Integer>();
		List<Integer> evenList = new ArrayList<Integer>();

		while(odd!=null && even!=null) {
			oddList.add(odd.val);
			evenList.add(even.val);

			if(even.next!=null) {
				even=even.next.next;
			}
			odd=odd.next.next;
		}

		List<Integer> result = new ArrayList<Integer>();

		for(int i=0; i<oddList.size(); i++) {
			result.add(oddList.get(i));
		}

		for(int j=0; j<oddList.size(); j++) {
			result.add(evenList.get(j));
		}


		return head;
	}

	public static void printList(ListNode head) {
		ListNode curr = head;
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);

		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		printList(head);
		head = oddEvenList(head);
		printList(head);
	}

}
