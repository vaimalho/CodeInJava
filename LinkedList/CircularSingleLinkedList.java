package linkedlist;

public class CircularSingleLinkedList {
	static Node head=null;
	static Node tail=null;
	static int size1=1;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	// Creating CSLL
	CircularSingleLinkedList(int data){
		Node node = new Node(data);
		node.next=node;
		head=node;
		tail=node;
	}
	
	// Traversing CSLL
	public void traverseList() {
		Node curr = head;
		if(curr==null) {
			System.out.println("List is Empty!!");
			return;
		}
		if(curr.next==curr) {
			System.out.println(curr.data);
			System.out.println(size1);
			return;
		}
		do {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		while(curr!=head);
		System.out.println();
		System.out.println(size1);
	}
	
	// Inserting Node in CSLL
	public void insertNode(int location,int data) {
		Node node = new Node(data);
		if(head==null) {
			node.next=node;
			head=node;
			tail=node;
		}
		else {
			if(location==0) {
				node.next=head;
				head=node;
				tail.next=head;
			}
			else if(location>=size1) {
				node.next=head;
				tail.next=node;
				tail=node;
			}
			else {
				Node temp = head;
				for(int i=1;i<location-1;i++) {
					temp=temp.next;
				}
				node.next=temp.next;
				temp.next=node;
			}
		}
		size1++;
	}
	
	// Searching in CSLL
	public void searchNode(int value) {
		Node temp=head;
		int index=1;
		do{
			if(temp.data==value) {
				System.out.println("Value found at index : " + index);
				return;
			}
			temp=temp.next;
			index++;
		}while(temp!=head);
		System.out.println("Value not available");
	}
	
	// Deleting a Node in a CSLL
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is Empty!!");
			return;
		}
		else {
			if(location==0) {
				head=head.next;
				tail.next=head;
			}
			else if(location==size1) {
				Node temp = head;
				while(temp.next!=tail) {
					temp=temp.next;
				}
				tail=temp;
				tail.next=head;
			}
			else {
				Node temp = head;
				for(int i=1;i<location-1;i++) {
					temp=temp.next;
				}
				temp.next=temp.next.next;
			}
		}
		size1--;
	}
	
	// Deleting Entire CSLL
	public void deleteLL() {
		head=null;
		tail.next=null;
		tail=null;
	}
}
