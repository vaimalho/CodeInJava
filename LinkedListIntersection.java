
/*
# Intersection of Two Linked Lists
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node c1:


It is guaranteed that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

 

Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
Example 2:


Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Intersected at '2'
Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: No intersection
Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
*/

package linkedlist;

import java.util.HashSet;
import java.util.Set;

import linkedlist.RemoveNthNodeFromEnd.ListNode;

public class LinkedListIntersection {

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	public static void main(String[] args) {
		ListNode headA = new ListNode(4);

		headA.next = new ListNode(1);
		headA.next.next = new ListNode(8);
		headA.next.next.next = new ListNode(4);
		headA.next.next.next.next = new ListNode(5);
		
		ListNode headB = new ListNode(5);

		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);
		headB.next.next.next = new ListNode(8);
		headB.next.next.next.next = new ListNode(4);
		headB.next.next.next.next.next = new ListNode(5);


		printList(headA);
		printList(headB);
		System.out.println(getIntersectionNode(headA,headB));
	}
	
	public static void printList(ListNode head) {
		ListNode curr = head;
		
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	// Time Complexity: O(N+M)
	// Space Complexity: O(N)
	public static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		
		Set<ListNode> set = new HashSet<ListNode>();
		
		ListNode currA = headA;
		ListNode currB = headB;
		
		//O(N)
		while(currA!=null) {
			set.add(currA);
			currA=currA.next;
		}
		
		//O(B)
		while(currB!=null) {
			if(set.contains(currB))
				return currB;
			currB=currB.next;
		}
		return null;
	}
	
	// Time Complexity: O(N+M)
	// SPace Complexity: O(1)
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		int lenA=0;
		int lenB=0;
		
		ListNode currA = headA;
		ListNode currB = headB;
		
		//O(N)
		while(currA!=null) {
			lenA++;
			currA=currA.next;
		}
		
		//O(M)
		while(currB!=null) {
			lenB++;
			currB=currB.next;
		}
		
		int diff = lenA-lenB;
		
		if(diff<0) {
			for(int i=0; i<Math.abs(diff); i++) {
				headB=headB.next;
			}
		}
		else {
			for(int i=0; i<Math.abs(diff); i++) {
				headA=headA.next;
			}
		}
		
		currA=headA;
		currB=headB;
		
		while(currA!=null && currB!=null) {
			if(currA==currB)
				return currA;
			currA=currA.next;
			currB=currB.next;
		}
		
		return null;
	}
}
