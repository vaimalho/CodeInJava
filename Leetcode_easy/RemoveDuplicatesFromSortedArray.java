/*
Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.


Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

C

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/

package leetcodeeasy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
	System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

	int idx = 1;
	
	for (int i = 1; i < nums.length; i++) {
	    if (nums[i] != nums[idx - 1]) {

		nums[idx++] = nums[i];

	    }
	}

	return idx;
    }

}
