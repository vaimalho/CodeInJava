package arrays;

import java.util.Arrays;

public class LargestElementArray {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 8, 7, 90, 56};
        System.out.println(largest(arr.length, arr));

    }

    // Time Complexity: O(NlogN)
    // SPace Complexity: O(1)
    public static int largest(int n, int[] arr) {
        if(n == 0)
            return -1;
        if(n==1)
            return arr[0];

        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int largest_Optimized(int n, int[] arr) {
        if(n == 0)
            return -1;
        if(n==1)
            return arr[0];

        int result = arr[0];
        for(int i : arr){
            if(i>result)
                result = i;
        }
         return result;
    }


}
