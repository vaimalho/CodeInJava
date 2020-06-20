// Time Complexity : O(n^2)
// Space Complexity : O(1)

// It is an In-place Sorting Technique
// Compare the adjacent elemnts and place the maximum element at it's appropriate position


import java.util.Scanner;

public class BubbleSortMain {

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
		
		bubbleSort(arr,n);
		
		System.out.println("Array After sorting!!");
		printArray(arr);
		
		
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i]+ " ");;
		}
	}
	public static void bubbleSort(int[] arr,int n) {
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
}