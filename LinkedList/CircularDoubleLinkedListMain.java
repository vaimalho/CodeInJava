package linkedlist;

public class CircularDoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularDoubleLinkedList obj = new CircularDoubleLinkedList(5);
		obj.traverse();
		
		obj.insertNode(0, 4);
		obj.insertNode(0, 3);
		obj.traverse();
		
		obj.insertNode(5, 6);
		obj.insertNode(55, 7);
		obj.traverse();
		
		obj.insertNode(3, 9);
		obj.traverse();
		
		obj.searchNode(7);
		obj.searchNode(3);
		obj.searchNode(9);
		obj.searchNode(33);
		
		obj.deleteNode(0);
		obj.traverse();
		
		obj.deleteNode(5);
		obj.traverse();
		
		obj.deleteNode(2);
		obj.traverse();
		
		obj.deleteLL();
		obj.traverse();
	}

}
