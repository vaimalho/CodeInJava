/*Find All Numbers Disappeared in an Array Easy

Share Given an array nums of n integers where nums[i]is in the range[1,n],
return an array of all the integers in the range[1,n]that do not appear in
 nums.

Example 1:

Input:nums=[4,3,2,7,8,2,3,1]Output:[5,6]Example 2:

Input:nums=[1,1]Output:[2]

Follow up:Could you do it without extra space and in O(n)runtime?You may 
assume the returned list does not count as extra space.
*/

package leetcodeeasy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbersInArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
	System.out.println(findDisappearedNumbers1(nums));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static List<Integer> findDisappearedNumbers(int[] nums) {

	List<Integer> list = new ArrayList<>();
	Set<Integer> set = new HashSet<>();

	for(int i:nums)
	    set.add(i);
	
	for (int i = 1; i <= nums.length; i++) {
	    if (!set.contains(i)) {
		list.add(i);
	    }
	}

	return list;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static List<Integer> findDisappearedNumbers1(int[] nums) {

	for (int i = 0; i < nums.length; i++) {
	    
	    // find the index
	    int index = Math.abs(nums[i]) - 1;

	    // mark the array indices as visitied based on array value
	    if (nums[index] > 0)
		nums[index] *= -1;
	}

	List<Integer> result = new ArrayList<>();

	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > 0)
		result.add(i + 1);
	}
	return result;
    }

}
