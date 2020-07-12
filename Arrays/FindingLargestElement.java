package arrays;

public class FindingLargestElement {

	static int largest = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,6,11,2,3,9};
		System.out.println(largestElemenIterative(arr));
		System.out.println(largestElementRecursive(arr,arr.length-1));
	}
	
	// Iterative Approach
	public static int largestElemenIterative(int[] arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}
	
	// Recursive Approach
	public static int largestElementRecursive(int[] arr,int n) {
		if(n==-1)
			return largest;
		if(arr[n]>largest) {
			largest=arr[n];
		}
		return largestElementRecursive(arr,n-1);
		
	}

}
