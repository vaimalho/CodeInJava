/*Climbing Stairs

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
package dynamicprogramming;

public class ClimbingStairsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		System.out.println(noOfWays(N));
		
		int[] memoize = new int[N+1];
		System.out.println(noOfWays_TopDown(memoize,N));
		
		System.out.println(noOfWays_BottomUp(N));

	}
	
	// Recurssive Solution
	// Time Complexity: O(2^N)
	
	public static int noOfWays(int N) {
		if(N<1)
			return -1;
		if(N<3)
			return N;
		return noOfWays(N-1) + noOfWays(N-2);
	}
	
	// Using Dynamic Programming i.e. Recurssion + Memoization
	// Time Complexity: O(N)
	// Top Down Approach
	public static int noOfWays_TopDown(int[] memoize, int n) {
		if(n<1)
			return -1;
		if(n<3)
			return n;
		if(memoize[n]==0) {
			memoize[n] = noOfWays_TopDown(memoize,n-1) + noOfWays_TopDown(memoize,n-2);
		}
		return memoize[n];
	}
	
	// Using Dynamic Programming i.e. Recurssion + Memoization
	// Time Complexity: O(N)
	// Bottom Up Approach
	public static int noOfWays_BottomUp(int n) {
		int[] dp = new int[n+1];
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
	
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int climbStairs1(int n) {

        if(n<=0)
            return 0;
        if(n==1)
            return 1;

        int first = 1;
        int second = 2;

        for(int i=3;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
