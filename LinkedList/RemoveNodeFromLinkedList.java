/*# Remove Linked List Elements


Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
*/

package linkedlist;

public class RemoveNodeFromLinkedList {

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	// Time Complexity: O(N)
	// Space Complexity: O(1)
	public static ListNode removeElements(ListNode head, int val) {

		// Using Sentinel Node
		ListNode sentinel = new ListNode(0);
		sentinel.next = head;
		
		ListNode prev = sentinel;
		ListNode curr = head;
		
		while(curr!=null) {
			if(curr.val == val) {
				prev.next = curr.next;
			}
			else {
				prev = curr;
			}
			curr = curr.next;
		}
			
		return sentinel.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);

		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		
		removeElements(head,6);
	}

}
