/*
Majority Element

        Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



        Example 1:

        Input: nums = [3,2,3]
        Output: 3
        Example 2:

        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
*/
package leetcodeeasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        // int[] nums = new int[] {2,2,1,1,1,2,2};
        int[] nums = new int[] {3,2,3};
        System.out.println(majorityElement(nums));
    }

    // Time Complexity: O(N)
    // SPace Complexity: O(1)
    public static int majorityElement2(int[] nums) {

        int count = 0;
        int result=0;

        for(int i : nums){
            if(count==0)
                result=i;
            count = count + ((result==i) ? 1 : -1);
        }
        return result;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap();
        int value= Integer.MIN_VALUE;
        int result=0;

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i: map.keySet()){
            if(map.get(i) > value) {
                value = map.get(i);
                result = i;
            }
        }

        return result;

    }

    // Time Complexity: O(NlogN)
    // SPace COmplexity: O(1);
    public static int majorityElement1(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
