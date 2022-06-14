/*
Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

package leetcodeeasy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
	System.out.println(containsDuplicate(nums));

    }

    // Time Complexity: O(N)
    // Space COmplexity: O(N)
    public static boolean containsDuplicate(int[] nums) {

	Set<Integer> set = new HashSet<Integer>();

	for (int i : nums) {
	    if (set.contains(i))
		return true;
	    set.add(i);
	}
	return false;
    }

    // Time Complexity: O(NLogN)
    // Space COmplexity: O(1)
    public static boolean containsDuplicate1(int[] nums) {
	java.util.Arrays.sort(nums);

	for (int i = 0; i < nums.length - 1; i++) {
	    if (nums[i] == nums[i + 1])
		return true;
	}

	return false;
    }

}
