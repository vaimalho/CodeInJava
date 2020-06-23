// It is a Divide and Conquer Algo
// It is a Recursive Algo
// It is not an In-Place Algo
// it is a stable sort

// Time Complexity : O(nlogn)
// Space COmplexity : O(n)

public class MergeSortMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,11,5,7,6};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
		
	}

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		if(n<2)
			return;
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i=0; i<mid ;i++)
			left[i] = arr[i];
		for(int j=0; j<n-mid;j++)
			right[j] = arr[mid+j];
	
		mergeSort(left);
		mergeSort(right);
		merge(arr,left,right);           
	}
	
	public static void merge(int[] arr,int[] left,int[] right) {
		int LL = left.length;
		int RL = right.length;
		int i=0,j=0,k=0;
		
		while(i<LL && j<RL) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;	
		}
		while(i<LL) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<RL) {
			arr[k]=right[j];
			j++;
			k++;
		}
	}
}
