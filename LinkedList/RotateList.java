/*
# Rotate List


Given the head of a linked list, rotate the list to the right by k places.

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
*/

package linkedlist;

public class RotateList {

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
	
	public static ListNode rotateRight(ListNode head, int k) {

		if(head==null || head.next==null)
			return head;
		
		ListNode curr = head;
		ListNode temp = head;
		int size=0;
		
		while(curr!=null) {
			size++;
			curr=curr.next;
		}
		
		curr = head;
		k = k%size;
		
		for(int i=0; i<k; i++) {
			curr=curr.next;
		}
		
		while(curr.next!=null) {
			temp=temp.next;
			curr=curr.next;
		}
		
		curr.next = head;
		head = temp.next;
		temp.next=null;
		
		return head;
	}
	
	public static ListNode rotateRight1(ListNode head, int k) {
		
		if(head==null || head.next==null || k==0)
			return head;
		
		ListNode curr = head;
		ListNode temp = head;
		int size=1;
		
		while(curr.next!=null) {
			size++;
			curr=curr.next;
		}
		
		curr.next = head;
		k = k%size;
		
		for(int i=1; i<size-k; i++) {
			temp=temp.next;
		}
		
		head = temp.next;
		temp.next=null;
		
		return head;

	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(0);

		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		printList(head);
		head=rotateRight(head, 2);
		printList(head);
	}
}
