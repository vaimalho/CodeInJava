package linkedlist;

public class CircularDoubleLinkedList {

	static Node head = null;
	static Node tail = null;
	static int size=1;
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	// Creating First Node
	CircularDoubleLinkedList(int data){
		Node node = new Node(data);
		node.next=node;
		node.prev=node;
		head=node;
		tail=node;
	}
	
	// Traversing/Printing CDLL
	public static void traverse() {
		if(head==null) {
			System.out.println("List is Blank!!");
			return;
		}
		Node curr = head;
		do {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}while(curr!=head);
		System.out.println();
		System.out.println(size);
	}
	
	// Insertion in CDLL
	public static void insertNode(int location,int data) {
		Node node = new Node(data);
		if(head==null) {
			 node.next=node;
			 node.prev=node;
			 head=node;
			 tail=node;
		}
		else {
			if(location==0) {
				node.next=head;
				node.prev=tail;
				head.prev=node;
				tail.next=node;
				head=node;
			}
			else if(location>=size) {
				node.next=head;
				node.prev=tail;
				head.prev=node;
				tail.next=node;
				tail=node;
			}
			else {
				Node temp = head;
				for(int i=1;i<location-1;i++) {
					temp=temp.next;
				}
				node.next=temp.next;
				node.prev=temp;
				temp.next=node;
				node.next.prev=node;				
			}
		}
		size++;
	}
	
	// Searching an Element in CDLL
	public static void searchNode(int data) {
		int index=1;
		Node curr=head;
		do {
			if(curr.data==data) {
				System.out.println("Node found at index: " + index);
				return;
			}
			else {
				index++;
				curr=curr.next;
			}
		}while(curr!=head);
		System.out.println("Node not found!!");
	}
	
	// Deleting a Node in CDLL
	public static void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is already Empty!!");
			return;
		}
		else {
			if(location==0) {
				head=head.next;
				head.prev=tail;
				tail.next=head;
			}
			else if(location==size) {
				tail=tail.prev;
				tail.next=head;
				head.prev=tail;
			}
			else {
				Node temp=head;
				for(int i=1;i<location-1;i++) {
					temp=temp.next;
				}
				temp.next=temp.next.next;
				temp.next.prev=temp;
			}
		}
		size--;
	}
	
	// Delete entire CDLL
	public static void deleteLL() {
		tail.next=null;
		Node temp=head;
		while(temp!=null) {
			temp.prev=null;
			temp=temp.next;
		}
		head=tail=null;
	}
}
