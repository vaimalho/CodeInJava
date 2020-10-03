package binarytree;

public class BinaryTreeUsingArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeUsingArray obj = new BinaryTreeUsingArray(5);
		for(int i=1;i<=5;i++) {
			obj.insertNode(i*10);
		}
		
		// Level order Traverse
		System.out.println("\nLevel-order Traversal:");
		obj.levelOrderTraversal();


		//Pre order Traverse
		System.out.println("\n\nPre-order Traversal:");
		obj.preOrderTraversal(1);


		//Post order Traverse
		System.out.println("\n\nPost-order Traversal:");
		obj.postOrderTraversal(1);

		//In order Traverse
		System.out.println("\n\nIn-order Traversal:");
		obj.levelOrderTraversal();
		
		//Search for value in Tree
		System.out.println("\n\nSearching value 500 in the tree...");
		obj.searchNode(500);


		//Search for value in Tree
		System.out.println("Searching value 40 in the tree...");
		obj.searchNode(40);


		//Delete value from Tree
		System.out.println("\nDeleting node 500 from the tree...");
		obj.deleteNode(500);


		//Delete value from Tree
		System.out.println("Deleting node 40 from the tree...");
		obj.deleteNode(40);


		//Level order Traverse
		System.out.println("\nLevel-order Traversal:");
		obj.levelOrderTraversal();


		//Delete the entire Tree
		System.out.println("\n\nDeleting the entire Tree...");
		obj.deleteTree();
	}
	
	

}
