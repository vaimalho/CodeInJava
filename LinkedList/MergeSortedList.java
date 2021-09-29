/*
#Merge Two Sorted Lists

Merge two sorted linked lists and return it as a sorted list. 
The list should be made by splicing together the nodes of the first two lists.

 

Example 1:


Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
*/

package linkedlist;

public class MergeSortedList {

	static ListNode head;
	static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
	public static void printList(ListNode head) {
		ListNode curr = head;
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode p = new ListNode(0);
		ListNode newhead = p;
		
		while(l1!=null && l2!=null) {
			if(l1.val <= l2.val) {
				p.next = l1;
				p=l1;
				l1=l1.next;
			}
			else {
				p.next = l2;
				p=l2;
				l2=l2.next;
			}
		}
		
		p.next = (l1 !=null ? l1: l2);
		return newhead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode l1 = new ListNode(1);

		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);

		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		head = mergeTwoLists(l1, l2);
		printList(head);

	}

}
