/*
896. Monotonic Array

        An array is monotonic if it is either monotone increasing or monotone decreasing.

        An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

        Given an integer array nums, return true if the given array is monotonic, or false otherwise.

        Example 1:

        Input: nums = [1,2,2,3]
        Output: true
        Example 2:

        Input: nums = [6,5,4,4]
        Output: true
        Example 3:

        Input: nums = [1,3,2]
        Output: false
*/

package leetcodeeasy;

public class MonotonicArray {

    public static void main(String[] args) {

        int[] arr = new int[] {1,1,2};
        System.out.println(isMonotonic(arr));

    }

    // Time COmplexity: O(N)
    // Space ComplexityL O(1)
    public static boolean isMonotonic(int[] nums) {

        if(nums.length<=2)
            return true;
        return increasing(nums) || decreasing(nums);
    }

    private static boolean decreasing(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                return false;
        }
        return true;
    }

    private static boolean increasing(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1])
                return false;
        }
        return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean isMonotonic1(int[] nums) {

        if(nums.length<=2)
            return true;

        boolean increasing = true;
        boolean decreasing = true;

        for(int i=0; i<nums.length-1; i++){

            if(nums[i] > nums[i+1])
                increasing=false;
            if(nums[i] < nums[i+1])
                decreasing=false;
        }
        return increasing || decreasing;
    }


}
