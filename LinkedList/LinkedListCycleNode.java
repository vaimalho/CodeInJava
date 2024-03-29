/*Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Notice that you should not modify the linked list.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
*/

package linkedlist;

import java.util.HashSet;
import java.util.Set;

import linkedlist.Test.ListNode;

public class LinkedListCycleNode {

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	// Approach 1
	// Space Complexity: O(N)
	public static ListNode detectCycleNode(ListNode head) {
	    ListNode curr = head;
	    HashSet<ListNode> hs = new HashSet<ListNode>();
	    
	    while (curr != null) {
		if (hs.contains(curr))
		    return curr;

		hs.add(curr);
		curr = curr.next;
	    }
	    return null;
	}
	
	// Approach 2 // Recommended
	// Space Complexity : O(1)
	public static ListNode detectCycleNode2(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		if(head==null || head.next==null)
			return null;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return returnStartingNode(head,fast);
			}
		}
		return null;
	}

	private static ListNode returnStartingNode(ListNode head, ListNode fast) {
		
		ListNode curr=head;
		while(curr!=fast) {
			curr=curr.next;
			fast=fast.next;
		}
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		head.next.next.next.next = head.next.next;	
		System.out.println(detectCycleNode2(head));
	}

}
