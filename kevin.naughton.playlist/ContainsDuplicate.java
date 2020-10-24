/*Contains Duplicate

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
package kevin.naughton.playlist;
import java.util.*;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
        	if(set.contains(nums[i]))
        		return true;
        	set.add(nums[i]);
        }
        return false;
    }
}
