
public class HeapSortByArray {

	int[] arr =null;
	int sizeOfHeap;
	
	public HeapSortByArray(int size) {
		arr = new int[size+1]; // We will store the first elemt at 1st index that's why size+1
		sizeOfHeap=0;
	}

	public void insertInHeap(int value) {
		arr[++sizeOfHeap] = value;
		heapifyBottomToTop(sizeOfHeap);
		levelOrder();
	}
	
	public int extractMinOfHeap() {
		if(sizeOfHeap==0) {
			System.out.println("Heap is Empty!!");
			return -1;
		}
		int value = arr[1];
		arr[1] = arr[sizeOfHeap--];
		heapifyTopToBottom(1);
		levelOrder();
		return value;
	}

	private void heapifyTopToBottom(int index) {
		int left = 2*index;
		int right = 2*index + 1;
		int smallChild = 0;
		
		if(sizeOfHeap < left) //If there is no child of this node, then nothing to do. Just return.
			return;
		else if(sizeOfHeap == left) { //If there is only left child of this node, then do a comparison and return.
			if(arr[index] > arr[left]) {
				int temp = arr[index];
				arr[index] = arr[left];
				arr[left] = temp;
			}
			return;
		}
		else { 
			if(arr[left] < arr[right])
				smallChild = left;
			else
				smallChild = right;
			if(arr[index] > arr[smallChild]) { //If both children are there
				int temp = arr[index];
				arr[index] = arr[smallChild];
				arr[smallChild] = temp;
			}
		}
		heapifyTopToBottom(smallChild);
	}

	private void heapifyBottomToTop(int index) {
		// We are at root of the tree. Hence no more Heapifying is required.
		if(index<=1)
			return;
		int parent = index/2;
		
		// If Current value is smaller than its parent, then we need to swap
		if(arr[index] < arr[parent]) {
			int temp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = temp;
		}
		heapifyBottomToTop(parent);
	}

	private void levelOrder() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
