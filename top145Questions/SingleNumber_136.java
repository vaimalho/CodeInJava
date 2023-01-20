/*
136. Single Number

        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1

*/

package top145questions;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {

    public static void main(String[] args) {

        int[] nums = new int[] {4,1,2,1,2};
        System.out.println(singleNumber_Optimized(nums));

    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for(int i: map.keySet()){
            if(map.get(i) == 1)
                return i;
        }
        return -1;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int singleNumber_Optimized(int[] nums) {

        int result = 0;
        for(int i : nums){
            result = result ^ i;
        }
        return result;
    }
}
