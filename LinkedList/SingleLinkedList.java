package linkedlist;

public class SingleLinkedList {

	static Node head = null;
	static Node tail = null;
	static int size = 1;
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public SingleLinkedList(int value) {
		head = new Node(value);
		tail=head;
	}
	
	public void traverseList() {
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println();
		System.out.println(size);
	}
	
	public void insertNode(int value,int location) {
		Node node = new Node(value);
		if(head==null) {
			node.next=null;
			head=node;
			tail=node;
		}
		else {
			if(location==0) {
				node.next=head;
				head=node;
			}
			else if(location>=size) {
				node.next=null;
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
		size++;
	}
	
	public void searchNode(int value) {
		Node curr=head;
		int index=1;
		while(curr!=null) {
			if(curr.data==value) {
				System.out.println("Value found at index : " + index);
				return;
			}
			curr=curr.next;
			index++;
		}
		System.out.println("Value is not available");
	}
	
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("List is Empty.");
			return;
		}
		else {
			if(location==0) {
				head=head.next;
			}
			else if(location==size) {
				Node curr = head;
				while(curr.next!=tail) {
					curr=curr.next;
				}
				curr.next=null;
				tail=curr;
			}
			else {
				Node curr = head;
				for(int i=1;i<location-1;i++) {
					curr=curr.next;
				}
				curr.next=curr.next.next;
			}
			
		}
		size--;
	}
	
	public void deleteLL() {
		head=null;
		tail=null;
	}
}
