package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateMain {

    public static void main(String[] args) {

        int[] nums = new int[] {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    // Time Complexity: O(NlogN)
    // Space Complexity: O(1)
    public static boolean containsDuplicate(int[] nums) {

        if(nums.length<1)
            return false;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

    // Time COmplexity: O(N)
    public static boolean containsDuplicate_Optimized(int[] nums) {

        if(nums.length<1)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
