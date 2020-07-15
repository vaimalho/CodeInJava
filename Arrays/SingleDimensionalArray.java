package arrays;

public class SingleDimensionalArray {
	int[] arr = null;
	
	// Creating an Array
	public SingleDimensionalArray(int size) {
		arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	// Traversing/Printing an Array
	public void printArray() {
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Array No Longer Exist!!");
		}
	}
	
	// Inserting a Value in an Array
	public void insertValue(int location,int value) {
		try{
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("Value "+ value +" Inserted");
			}
			else {
				System.out.println("Cell already Occupied!!");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out OF Bound");
		}
	}
	
	// Accessing an Array Element
	public void accessElement(int location) {
		try {
			System.out.println(arr[location]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Location");
		}
	}
	
	// Searching an Element in an Array
	public void searchElement(int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value ) {
				System.out.println("Value found at index " + i);
				return;
			}
		}
		System.out.println("value doen't Exist");
	}
	
	// Deleting an Element From an Array
	public void deleteElement(int location) {
		try {
			if(arr[location] != Integer.MIN_VALUE) {
				arr[location] = Integer.MIN_VALUE;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Location");
		}
	}
	
	// Deleting Entire Array
	public void deleteArray() {
		arr=null;
		System.out.println("Array deleted");
	}
}
