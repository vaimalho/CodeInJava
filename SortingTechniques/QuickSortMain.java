// It is a Divide and Conquer Algo
// It is a Recursive Algo
// It is an In-place Algo
// It is not a stable sort

// Time Complexity : O(nlogn) --> In Best and Average Case
// Space Complexity : O(n)

// In worst case it has O(n^2) Time complexity --> To improve this use Randomized Quick Sort

public class QuickSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,8,3,7,2,6};
		printArray(arr);
		QuickSort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void QuickSort(int[] arr,int start,int end) {
		int pIndex=0;
		if(start<end) {
		pIndex = partition(arr,start,end);
		QuickSort(arr,start,pIndex-1);
		QuickSort(arr,pIndex+1,end);
		}
	}

	public static int partition(int[] arr,int start,int end) {
	
		int pivot = arr[end];
		int pIndex=start;
		for(int i=start;i<end;i++) {
			if(arr[i]<pivot) {
				int temp=arr[i];
				arr[i]=arr[pIndex];
				arr[pIndex]=temp;
				pIndex++;
			}
			
		}
		int temp = arr[pIndex];
		arr[pIndex]=arr[end];
		arr[end]=temp;
		return pIndex;
		
	}
}
