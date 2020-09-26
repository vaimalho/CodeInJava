package linkedlist;

import linkedlist.ReverseSingleLinkedListMain.Node;

public class PrintReverseOfSingleLinkedList {

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

	public static void printReverseList(Node head) {
		if(head==null) {
			return;
		}
		printReverseList(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintReverseOfSingleLinkedList obj = new PrintReverseOfSingleLinkedList();
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		
		obj.printList(head);
		obj.printReverseList(head);
	}

}
