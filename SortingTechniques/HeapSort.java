import java.awt.image.SampleModel;
import java.util.Random;

public class HeapSort {
	int[] arr = null;
	
	HeapSort(int[] arr){
		this.arr = arr;
	}
	
	public void sort() {
		HeapSortByArray hsa = new HeapSortByArray(arr.length);
		for(int i=0; i<arr.length; i++) {
			hsa.insertInHeap(arr[i]); //Insert in Heap
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = hsa.extractMinOfHeap(); //Extract from Heap and insert sorted data in current Array
		}
	}
	
	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
}
