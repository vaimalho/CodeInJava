/*
283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/

package arrays;

public class MoveZeros {

    public static void printArray(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
	System.out.println();
    }

    // Time Complexity: O(N)
    // Space COmplexity: O(1)

    // Faster
    public static void moveZeroes(int[] nums) {

	int index = 0;
	int len = nums.length;

	for (int i = 0; i < len; i++) {
	    if (nums[i] != 0) {
		nums[index++] = nums[i];
	    }
	}

	for (int i = index; i < len; i++) {

	    nums[i] = 0;
	}
    }

    // Time Complexity: O(N)
    // Space COmplexity: O(1)
    public static void moveZeroesTwoPointer(int[] nums) {

	int l = 0;
	int r = 0;

	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0) {
		int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
		l++;
	    }
	    r++;
	}

    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] arr = new int[] { 0, 1, 0, 3, 12 };
	printArray(arr);
	moveZeroes(arr);
	printArray(arr);

    }

}
