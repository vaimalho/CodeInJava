package linkedlist;

public class CircularSingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularSingleLinkedList list = new CircularSingleLinkedList(5);
		list.traverseList();
		
		list.insertNode(0, 4);
		list.insertNode(0, 3);
		list.traverseList();
		
		list.insertNode(5, 6);
		list.insertNode(55, 7);
		
		list.traverseList();
		
		list.insertNode(3, 9);
		list.traverseList();
		
//		list.searchNode(7);
		
		list.deleteNode(0);
		list.deleteNode(5);
		list.deleteNode(2);
		list.traverseList();
		
		list.deleteLL();
		list.traverseList();
	}

}
