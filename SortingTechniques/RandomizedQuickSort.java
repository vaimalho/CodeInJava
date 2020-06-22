// It is a Divide and Conquer Algo
// It is a Recursive Algo
// It is an In-place Algo
// It is not a stable sort
// In worst case it has O(n^2) Time complexity --> To improve this use Randomized Quick Sort

import java.util.Random;

public class RandomizedQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8};
		printArray(arr);
		quickSort(arr,0,arr.length-1);
		printArray(arr);
		
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		
		if(start<end) {
			int pIndex = RandomizedPartition(arr,start,end);
			quickSort(arr,start,pIndex-1);
			quickSort(arr,pIndex+1,end);
		}
		
	}
	
	public static int partition(int[] arr,int start,int end) {
		int pivot=arr[end];
		int pIndex=start;
		
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[pIndex];
				arr[pIndex]=temp;
				pIndex++;
			}
		}
		int temp=arr[pIndex];
		arr[pIndex]=arr[end];
		arr[end]=temp;
		
		return pIndex;
	}
	
	public static int RandomizedPartition(int[] arr,int start,int end) {
		Random r = new Random();
		int pivot = r.nextInt(end-start)+start;
		int temp = arr[pivot];
		arr[pivot] = arr[end];
		arr[end] = temp;
		
		return partition(arr,start,end);
	}
}
