/*Two Sum
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
package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMain {

    public static void main(String[] args) {

        int[] arr = new int[] {2,7,11,15};
        int target = 22;
        twoSum1(arr,target);

    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(N X N)
    // Space Complexity: O(1)
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] result = new int[2];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        printArray(result);
        return result;
    }

    // Two Pass
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int[] twoSum1(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i != map.get(target-nums[i]))
                return new int[] {i, map.get(target-nums[i])};
        }
        return null;
    }

    // One Pass
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i != map.get(target-nums[i]))
                return new int[] {i, map.get(target-nums[i])};
            map.put(nums[i], i);
        }
        return null;
    }
}
