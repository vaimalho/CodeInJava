/* Reverse Linked List

Solution
Given the head of a singly linked list, reverse the list, and return the reversed list.


Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 

Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

package linkedlist;

public class ReverseSingleLinkedListMain {

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	// Printing Single Linked List
	public static void printList(Node head) {
		if(head==null) {
			System.out.println("List is Blank!!");
			return;
		}
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	// Time Complexity: O(N)
	// Space Complexity: O(1)
	public static Node reverseList(Node head) {
		Node prev=null;
		Node curr=head;
		Node next=head;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}

	// Time Complexity: O(N)
	// Space Complexity: O(N)
	public static Node reverseList1(Node head) {

	    if (head == null || head.next == null)
		return head;

	    Node newHead = reverseList1(head.next);
	    head.next.next = head;
	    head.next = null;

	    return newHead;

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseSingleLinkedListMain obj = new ReverseSingleLinkedListMain();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		
		obj.printList(head);
		Node newHead = reverseList(head);
		obj.printList(newHead);
	}

}
