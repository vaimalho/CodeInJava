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

import linkedlist.Test.ListNode;

public class PalindromeLinkedList {

	static ListNode head;
	static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	// Space Complexity: O(N)
	public static boolean isPalindrome(ListNode head) {
		
		ListNode curr = head;
		List<Integer> l = new ArrayList<Integer>();
		while(curr!=null) {
			l.add(curr.val);
			curr=curr.next;
		}


		int start=0;
		int end = l.size()-1;
		while(start < end) {
			if(l.get(start)!=l.get(end))
				return false;
			start++;
			end--;
		}
		return true;

		//			for(int i=0, j=l.size()-1; i<l.size() && j>=0; i++, j--) {
		//					if(l.get(i)!=l.get(j))
		//						return false;
		//			}
		//			return true;
	}
	
	// Space Complexity: O(1)
    public static boolean isPalindrome1(ListNode head) {

		ListNode firstHalf =  endofFirstHalf(head);
		ListNode seconfHalf = reverseSeconfhalf(firstHalf.next);
		
		ListNode p1=head;
		ListNode p2=seconfHalf;
		
		while(p2!=null) {
			if(p1.val!=p2.val)
				return false;
			p1=p1.next;
			p2=p2.next;
		}
		return true;
	}
		
		
	private static ListNode reverseSeconfhalf(ListNode head) {
		// TODO Auto-generated method stub
		ListNode prev=null;
		ListNode curr=head;
		ListNode n =head;
		
		while(curr!=null) {
			n=curr.next;
			curr.next=prev;
			prev=curr;
			curr=n;
		}
		return prev;
	}

	private static ListNode endofFirstHalf(ListNode head) {
		// TODO Auto-generated method stub
		ListNode slow=head;
		ListNode fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);

		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
//		head.next.next.next.next = new ListNode(4);
//		head.next.next.next.next.next = new ListNode(5);
//		head.next.next.next.next.next.next = new ListNode(6);

		System.out.println(isPalindrome(head));
	}

}
