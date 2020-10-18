/*Search Insert Position

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
*/
package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,6};
		int target= 0;
		System.out.println(searchInsert1(nums, target));
				

	}
	
	// Approach 1 --> O(n)
	public static int searchInsert(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++){
			if(target<nums[i])
				return i;
		}
		return nums.length;
	}
	
	// Approach 2 --> O(logn)
	public static int searchInsert1(int[] nums, int target) {
		
		int low=0;
		int mid=0;
		int high=nums.length-1;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(target==nums[mid])
				return mid;
			else if(target<nums[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return low;
		
	}

}
