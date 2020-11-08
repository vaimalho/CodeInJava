// Finds the minimum element and place it at it's apt position
// It is an in-place sorting
// It is not a stable sort

// Time Complexity : O(n^2)
// Space Complexity : O(1)

import java.util.Scanner;

public class SelectionSortMain {

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
		
		selectionSort1(arr);
		
		System.out.println("Array After sorting!!");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] arr) {

		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n-1;j++) {
				if(arr[j]<arr[min])
					min=j;
			}
			if(min!=i){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
