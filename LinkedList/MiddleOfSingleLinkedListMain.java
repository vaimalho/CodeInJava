package linkedlist;

public class MiddleOfSingleLinkedListMain {

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
	
	// Finding Middle Of Single Linked List
	public static void middleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	// Finding and Deleting the Middle Of Single Linked List
	public static void deleteMiddleElement(Node head) {
		Node slow = head;
		Node fast = head;
		Node temp = head;
		while(fast!=null && fast.next!=null) {
			temp=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		temp.next=slow.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiddleOfSingleLinkedListMain obj = new MiddleOfSingleLinkedListMain();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		
		obj.printList(head);
		middleElement(head);
		obj.deleteMiddleElement(head);
		obj.printList(head);
	}

}
