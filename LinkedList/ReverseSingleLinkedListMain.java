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
