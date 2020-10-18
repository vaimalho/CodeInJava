package leetcode;
/*Odd Even Linked List
Solution
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
*/

public class OddEvenLinkedList {

	Node head = null;
	static class Node  
	{  
	    int data;  
	    Node next;  
	    
	    Node(int data){
	    	this.data=data;
	    	this.next=null;
	    }
	} 
	
	public static void printlist(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	//Appraoch 1
	public static Node rearrangeEvenOdd(Node head) {
		
		if(head==null)
			System.out.println("LL does not exist");
		
		Node odd = head;
		Node even = odd.next;
		Node evenStart = even;
		
		while(true) {

		if(even==null || even.next==null) {
			odd.next=evenStart;
			break;
		}
            odd.next = even.next;
			odd=even.next;
			
			if(odd.next==null) {
				even.next=null;
				odd.next=evenStart;
				break;
			}
			else {
				even.next=odd.next;
				even=odd.next;
			}
		}
		return head;
		
	}
	
	//Approach 2 --> Optimized
	public static Node rearrangeEvenOdd1(Node head) {
		
		if(head==null)
			System.out.println("LL does not exist");
		
		Node odd = head;
		Node even = odd.next;
		Node evenStart = even;
		
		while(true) {

		if(even==null || even.next==null) {
			odd.next=evenStart;
			break;
		}
            odd.next = even.next;
			odd=even.next;
			
			if(odd.next==null) {
				even.next=null;
				odd.next=evenStart;
				break;
			}
			else {
				even.next=odd.next;
				even=odd.next;
			}
		}
		return head;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(2);  
	    head.next = new Node(1);  
	    head.next.next = new Node(3);  
	    head.next.next.next = new Node(5);  
	    head.next.next.next.next = new Node(6);  
	    head.next.next.next.next.next = new Node(4); 
	  
	    System.out.println("Given Linked List");  
	    printlist(head);  
	  
	    head = rearrangeEvenOdd(head);  
	  
	    System.out.println("Modified Linked List");  
	    printlist(head);
	}

}
