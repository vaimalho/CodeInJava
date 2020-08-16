package linkedlist;

public class DoubleLinkedList {

	static Node head=null;
	static Node tail=null;
	static int size=1;
	static class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	// Creating DLL
	public DoubleLinkedList(int data) {
		Node node = new Node(data);
		head=node;
		tail=node;
	}
	
	// Traver DLL
	public static void traverse() {
		if(head==null) {
			System.out.println("List doesn't exist");
			return;
		}
		Node curr = head;
		if(curr.next==null) {
			System.out.println(curr.data);
			return;
		}
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
		System.out.println(size);
	}
	
	// Insertion in DLL
	public static void insertNode(int location,int value) {
		Node node = new Node(value);
		if(head==null) {
			node.next=null;
			node.prev=null;
		    tail=node;
			head=node;
		}
		else {
			if(location==0) {
				node.prev=null;
				node.next=head;
				head.prev=node;
				head=node;
			}
			else if(location>=size) {
				node.next=null;
				node.prev=tail;
				tail.next=node;
				tail=node;
			}
			else {
				Node temp = head;
				for(int i=0;i<location-1;i++) {
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
	
	// Search in DLL
	public static void searchNode(int value) {
		Node curr = head;
		int index=1;
		while(curr!=null) {
			if(curr.data==value) {
				System.out.println("Value found at index : " + index);
				return;
			}
			curr=curr.next;
			index++;
		}
		System.out.println("Value doesn't exist");
	}
	
	// Deletion in DLL
	public static void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is Empty!!");
			return;
		}
		else {
			if(location==0) {
				head=head.next;
				head.prev=null;
			}
			else if(location==size) {
				tail=tail.prev;
				tail.next=null;
			}
			else {
				Node temp = head;
				for(int i=1;i<location-1;i++) {
					temp=temp.next;
				}
				temp.next=temp.next.next;
				temp.next.prev=temp;
			}
		}
		size--;
	}
	
	// Delete Entire DLL
	public static void deleteLL() {
		Node curr = head;
		while(curr!=null) {
			curr.prev=null;
			curr=curr.next;
		}
		head=null;
		tail=null;
	}
}
