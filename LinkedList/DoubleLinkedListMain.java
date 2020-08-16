package linkedlist;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleLinkedList list = new DoubleLinkedList(5);
		list.traverse();
		
		list.insertNode(0, 4);
		list.insertNode(0, 3);
		list.insertNode(3, 6);
		list.insertNode(33, 7);
		
		list.traverse();
		
		list.searchNode(3);
		list.searchNode(50);
		
		list.deleteNode(0);
//		list.deleteNode(4);
		list.deleteNode(2);
		
		list.traverse();
		
		list.deleteLL();
		list.traverse();
	}

}
