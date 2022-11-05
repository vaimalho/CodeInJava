/*Missing Number

        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



        Example 1:

        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
        Example 2:

        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
        Example 3:

        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
*/
package leetcodeeasy;

import java.util.*;

public class MissingNumberMain {

    public static void main(String[] args) {

        int[] arr = new int[] {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }

    // Time Complexity: O(NlogN)
    // Space Complexity: O(1)
    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(count!=nums[i])
                return i;
            count++;
        }
        return nums.length;;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int missingNumber1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i : nums)
            set.add(i);

        for(int i=0;i<nums.length; i++){
            if(!set.contains(i))
                return i;
        }

        return nums.length;

    }

    // Time Complexity: O(N)
    // SPace Complexity: O(1)
    public static int missingNumber2(int[] nums) {

        int n=nums.length;
        int sum=0;

        int expectedSum = n*(n+1)/2;

        for(int i : nums){
            sum += i;
        }

        return expectedSum - sum;

    }
}
