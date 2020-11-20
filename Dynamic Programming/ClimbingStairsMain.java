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
		int[] memoize = new int[N+1];
		System.out.println(noOfWays(memoize,N));

	}
	
	// Recurssive Solution
	// Time Complexity: O(2^N)
	
	public static int noOfWays(int N) {
		if(N<=1)
			return 1;
		return noOfWays(N-1) + noOfWays(N-2);
	}
	
	// Using Dynamic Programming i.e. Recurssion + Memoization
	// Time Complexity: O(N)
	
	public static int noOfWays(int[] memoize, int n) {
		if(n<=1)
			return 1;
		if(memoize[n]==0) {
			memoize[n] = noOfWays(memoize,n-1) + noOfWays(memoize,n-2);
		}
		return memoize[n];
	}
}
