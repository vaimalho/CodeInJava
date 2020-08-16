package linkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList list = new SingleLinkedList(5);
		list.traverseList();
		list.insertNode(4, 0);
		list.traverseList();
		list.insertNode(9, 5);
		list.traverseList();
		list.insertNode(10, 4);
		list.traverseList();
		list.insertNode(11, 3);
		list.traverseList();
	
		list.deleteNode(4);
		list.traverseList();
		
		list.deleteNode(2);
		list.traverseList();
	}

}
