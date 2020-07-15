package arrays;

public class SingleDimensionalArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleDimensionalArray obj = new SingleDimensionalArray(10);
		obj.printArray();
		
		obj.insertValue(0, 1);
		obj.insertValue(1, 2);
		obj.insertValue(2, 3);
		obj.insertValue(3, 4);
		obj.insertValue(4, 5);
		obj.insertValue(5, 6);
		obj.insertValue(6, 7);
		obj.insertValue(7, 8);
		obj.insertValue(8, 9);
		obj.insertValue(9, 10);
		obj.insertValue(2, 11);
		obj.insertValue(22, 11);
		
		obj.printArray();
		
		obj.accessElement(3);
		obj.accessElement(30);
		
		obj.searchElement(6);
		obj.searchElement(60);
		
		obj.deleteElement(4);
		obj.deleteElement(40);
		
		obj.printArray();
		
		obj.deleteArray();
		
		obj.printArray();
	}

}
