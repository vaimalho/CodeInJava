/*
 Two Sum
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


*/

package blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMain {

    public static void main(String[] args) {

        int[] arr = new int[] {2,7,11,15};
        int target = 9;
        int[] result = twoSum_Optimized(arr, target);
        for(int i : result)
            System.out.print(i + " ");
    }

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return null;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int[] twoSum_Optimized(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int b = target - nums[i];
            if(map.containsKey(b) && map.get(b) != i)
                return new int[] {i, map.get(b)};
        }
        return null;
    }

}
