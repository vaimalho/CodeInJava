/*Search in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
*/
package leetcode;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target=4;
		System.out.println(search(nums, target));

	}
	
	public static int search(int[] nums, int target) {
        
		int low=0;
		int high=nums.length-1;
		int mid=0;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(target==nums[mid])
				return mid;
			if(nums[mid]<nums[high]) {
				if(target>nums[mid] && target<=nums[high])
					low=mid+1;
				else {
					high=mid-1;
				}
				
			}
			else {
				if(target>=nums[low] && target<nums[mid])
					high=mid-1;
				else {
					low=mid+1;
				}
			}
		}
		return -1;
    }

}
