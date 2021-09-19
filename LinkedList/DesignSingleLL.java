/*
# Design Linked List

Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 

Example 1:

Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]

Explanation
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
myLinkedList.get(1);              // return 3
*/

package linkedlist;

public class DesignSingleLL {

	static ListNode head;
	static int size;
	 class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int val){
			this.val=val;
			this.next=null;
		}
	}
	
    /** Initialize your data structure here. */
    public DesignSingleLL() {
        head = null;
        size=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size)
        	return -1;
        ListNode curr = head;
        for(int i=0; i<index; i++) {
        	curr=curr.next;
        }
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode curr = new ListNode(val);
        curr.next=head;
        head=curr;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	
    	ListNode curr = new ListNode(val);
    	
    	if(head==null) {
    		head=curr;
    	}
    	else {
            ListNode temp = head;
            while(temp.next!=null) {
            	temp=temp.next;
            }
            temp.next=curr;
    	}
    	size++;

    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    	if(index==0) {
    		addAtHead(val);
    	}
    	else if(index==size) {
    		addAtTail(val);
    	}
    	else if(index>size) {
    		return;
    	}
    	else {
    		ListNode curr = new ListNode(val);
    		ListNode prev = head;
    		for(int i=0; i<index-1; i++) {
    			prev=prev.next;
    		}
    		curr.next=prev.next;
    		prev.next=curr;
    	}
    	size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
        	return;
        else if(index==0) {
        	head=head.next;
        }
        else {
            ListNode prev = head;
            for(int i=0; i<index-1; i++) {
            	prev=prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }
    
    public static void printList(ListNode head) {
		ListNode curr = head;
		while(curr!=null) {
			System.out.print(curr.val + " ");
			curr=curr.next;
		}
		System.out.println();
	}
    
    public static void main(String[] args) {
    	 DesignSingleLL obj = new DesignSingleLL();
    	  
    	  obj.addAtHead(1);
    	  obj.addAtTail(3);
    	  obj.addAtIndex(1, 2);
    	  
    	  printList(head);
    	  System.out.println(size);
    	  
    	  obj.deleteAtIndex(0);
    	  printList(head);
    	  System.out.println(size);
    	  obj.get(0);
    	  
    	  
    	  
    	  printList(head);
    	  System.out.println(size);
    	  
//    	  obj.deleteAtIndex(1);
//    	  obj.get(1);
    	  
    	  
//    	  obj.addAtHead(2);
//    	  obj.addAtHead(7);
//    	  obj.addAtHead(3);
//    	  obj.addAtHead(2);
//    	  obj.addAtHead(5);
//    	  
//    	  printList(head);
//    	  System.out.println(size);
//    	  
//    	  obj.addAtTail(5);
//    	  obj.get(5);
//    	  obj.deleteAtIndex(6);
//    	  obj.deleteAtIndex(4);
//    	  
//    	  printList(head);
//    	  System.out.println(size);
    }
}
