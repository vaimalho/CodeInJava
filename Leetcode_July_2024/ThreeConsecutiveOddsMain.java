/*
Three Consecutive Odds

Given an integer array arr, return true if there are three consecutive odd numbers in the array.
Otherwise, return false.

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
 */
package leetcode.july;

public class ThreeConsecutiveOddsMain {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean threeConsecutiveOdds(int[] arr) {

        if(arr.length<3)
            return false;
        int count = 0;

        for(int i=0;i< arr.length; i++){
            if(arr[i] % 2 !=0 ){
                count++;
                if(count == 3)
                    return true;
            }
            else count=0;
        }
        return false;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean threeConsecutiveOdds1(int[] arr) {

        if(arr.length<3)
            return false;

        for(int i=0;i< arr.length-2; i++){
            if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0)
                return true;
        }
        return false;
    }
}
