/*
70. Climbing Stairs

        You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:

        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:

        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step

*/

package top145questions;

public class ClimbingStairs_70 {

    public static void main(String[] args) {

        int n=43;
        System.out.println(climbStairs_Fibonnaci(n));
    }

    // Top-Down : Recurrsion + Memoization
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int climbStairs(int n){

        int[] arr = new int[n+1];
        return climbStairs(n,arr);

    }

    public static int climbStairs(int n, int[] arr){

        if(arr[n] == 0){
            if(n<=3)
                return n;
            arr[n] = climbStairs(n-1, arr) + climbStairs(n-2, arr);
        }
        return arr[n];
    }

    // Time Complexity: O(N)
    // Space CComplexity: O(N)
    public static int climbStairs_BottomUp(int n){

        if(n == 1)
            return 1;
        int[] arr = new int[n+1];

        arr[1]  = 1;
        arr[2] = 2;

        for(int i=3; i<arr.length; i++)
            arr[i] = arr[i-1] + arr[i-2];

        return arr[n];
    }

    // Time Complexity : O(N)
    // Space Complexity: O(1)
    public static int climbStairs_Fibonnaci(int n){

        if(n==1)
            return 1;

        int first = 1;
        int second = 2;

        for(int i=3; i<=n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
