package binarytree;

public class BinaryTreeUsingArray {

	static int[] tree = null;
	static int lastUsedIndex=0;
	
	// Creation of Binary Tree
	// Time: O(1)
	// Space: O(n)
	public BinaryTreeUsingArray(int size) {
		// TODO Auto-generated constructor stub
		tree = new int[size+1];
	}
	
	// Checking if Binary Tree is Full
	// Time: O(1)
	// Space: O(1)
	public static boolean isFull() {
		if(lastUsedIndex == tree.length)
			return true;
		return false;
	}
	
	// Insertion in Binary Tree
	// Time: O(1)
	// Space: O(1)
	public static void insertNode(int value) {
		if(isFull()) {
			System.out.println("Tree is Full, No Space Available!!");
			return;
		}
		tree[lastUsedIndex+1] = value;
		lastUsedIndex++;
	}
	
	// Searching an Element in Binary Tree
	// Time: O(n)
	// Space: O(1)
	public static void searchNode(int value) {
		for(int i=1;i<=lastUsedIndex;i++) {
			if(tree[i]==value) {
				System.out.println("Value " + tree[i] + "found at index: " + i);
				return;
			}
		}
		System.out.println("Value is Not Available in the tree");
	}
	
	// Inorder Traversal
	// Time: O(n)
	// Space: O(1)
	public static void inorderTraversal(int index) {
		if(index>lastUsedIndex)
			return;
		inorderTraversal(index*2);
		System.out.println(tree[index]);
		inorderTraversal(index*2+1);
	}
	
	// PreOder Traversal
	// Time: O(n)
	// Space: O(1)
	public static void preOrderTraversal(int index) {
		if(index>lastUsedIndex)
			return;
		System.out.print(tree[index] + " ");
		preOrderTraversal(index*2);
		preOrderTraversal(index*2+1);
	}
	
	// PostOrder Traversal
	// Time: O(n)
	// Space: O(1)
	public static void postOrderTraversal(int index) {
		if(index>lastUsedIndex)
			return;
		postOrderTraversal(index*2);
		postOrderTraversal(index*2+1);
		System.out.print(tree[index] + " ");
	}
	
	// Level Order Traversal
	// Time: O(n)
	// Space: O(1)
	public static void levelOrderTraversal() {
		for(int i=1; i<=lastUsedIndex; i++) {
			System.out.print(tree[i] + " ");
		}
		System.out.println();
	}
	
	// Deleting a Node from Binary Tree
	// Time: O(n)
	// Space: O(1)
	public static void deleteNode(int value) {
		int tempIndex=0;
		for(int i=1;i<lastUsedIndex;i++) {
			if(tree[i]==value)
				tempIndex=i;
		}
		if(tempIndex==0) {
			System.out.println("Value is not available in Tree");
			return;
		}
		tree[tempIndex] = tree[lastUsedIndex-1];
		lastUsedIndex--;
	}
	
	// Deleting Entire Binary Tree
	// Time: O(1)
	// Space: O(1)
	public static void deleteTree() {
		tree=null;
	}
	
}
