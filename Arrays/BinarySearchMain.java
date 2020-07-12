package arrays;

import java.util.Arrays;

public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8,11,13,19};
		int value=12;
		System.out.println(searcIndex(arr, 0, arr.length-1, value));
	}

	public static int searcIndex(int[] arr,int low,int high,int value) {
		int mid = low+(high-low)/2;
		if(low<=high){
			if(arr[mid]==value)
				return mid;
			else if(value>arr[mid])
				return searcIndex(arr,mid+1,high,value);
			else
				return searcIndex(arr,low,mid-1,value);
		}
		return -1;
	}
}
