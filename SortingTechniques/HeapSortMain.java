
public class HeapSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,5,30,15,50,5,25,35,1};
		HeapSort obj = new HeapSort(arr);
		System.out.println("User entered Array: ");
		obj.printArray();
		System.out.println("\n");
		
		obj.sort();
		
		System.out.println("\n\nAfter sorting: ");
		obj.printArray();
	}

}
