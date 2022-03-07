/*Linked List Cycle


Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.


Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the first node.


Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 */
package leetcode;
import java.util.*;

import javax.naming.ldap.HasControls;
public class DetectLoopInLinkedList {

	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		head.next.next.next.next = head.next.next;	
		System.out.println(hasCycle(head));
	}

	// Approach 1
	// Time Comlexity: O(n)
	// Space Complexity: O(n)
	public static boolean hasCycle(ListNode head) {
	    ListNode curr = head;
	    HashSet<ListNode> hs = new HashSet<ListNode>();
	    
	    while (curr != null) {
		if (hs.contains(curr))
		    return true;

		hs.add(curr);
		curr = curr.next;
	    }
	    return false;
	}
	
	// Approach 2
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static boolean hasCycle1(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null)
            return false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}
