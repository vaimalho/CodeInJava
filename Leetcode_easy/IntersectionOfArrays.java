/*
Intersection of Two Arrays II

        Share
        Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Explanation: [9,4] is also accepted.


        Constraints:

        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000


        Follow up:

        What if the given array is already sorted? How would you optimize your algorithm?
        What if nums1's size is small compared to nums2's size? Which algorithm is better?
        What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

*/
package leetcodeeasy;

import java.util.*;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {9,4,9,8,4};
        System.out.println(intersect1(nums1, nums2));

    }

    // Time Complexity: O(N+M)
    // Space CComplexity: O(N+M)
    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int i : nums1)
            map.put(i, map.getOrDefault(i,0)+1);

        for(int i : nums2){
            if(map.containsKey(i) && map.get(i)>0){
                ls.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        int[] result = ls.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    // Optimized Solution of Above

    // TIme Complexity: O(N+M)
    // Space CComplexity: O(min(N,M)
    public static int[] intersect1(int[] nums1, int[] nums2) {

        if(nums2.length < nums1.length)
            return intersect1(nums2, nums1);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1)
            map.put(i, map.getOrDefault(i,0)+1);

        int k=0;
        for(int i : nums2){
            if(map.containsKey(i) && map.get(i)>0){
                nums1[k++] = i;
                map.put(i, map.get(i)-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    // Time CComplexity: O(NlogN + MlogM)
    // Space Complexity: O(logN + logM)
    public static int[] intersect2(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr = new int[nums2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                arr[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(arr,0,k);
    }

    // Time CComplexity: O(NlogN + MlogM)
    // Space Complexity: O(logN + logM)
    public static int[] intersect3(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0, k=0;

        while(i< nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
