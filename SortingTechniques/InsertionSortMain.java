// Divides the Array into 2 parts --> Sorted and UnSorted
// Picks one element from Unsorted Part and place at it's apt position in Sorted Part

// Time Complexity: O(n^2)
// Space Complexity: O(1)

// It is an In-place and Stable Sort

import java.util.Scanner;

public class InsertionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Before sorting!!");
		printArray(arr);
		
		insertionSort(arr);
		
		System.out.println("Array After sorting!!");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void insertionSort(int[] arr) {
		int n= arr.length;
		
		int value=0;
		int j=0;
		
		for(int i=1;i<n;i++) {
			value=arr[i];
			j=i;
			while(j>0 && arr[j-1]>value) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
		}
	}
}
