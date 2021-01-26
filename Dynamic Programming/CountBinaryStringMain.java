/*
 Count number of binary strings without consecutive 1's

Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1's.
Examples:

Input:  N = 2
Output: 3
// The 3 strings are 00, 01, 10

Input: N = 3
Output: 5
// The 5 strings are 000, 001, 010, 100, 101
*/

package dynamicprogramming;

public class CountBinaryStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=4;
		System.out.println(countBinaryString(N));
		
		int[] dp = new int[N+1];
        System.out.println(countBinaryString_TopDown(dp, N));
        
        System.out.println(countBinaryString_BottomUp(N));
	}
	
	
	// Divide & Conquer
	public static int countBinaryString(int N) {
		
		if(N == 1)
			return 2;
		if(N == 2)
			return 3;
		
		return countBinaryString(N-1) + countBinaryString(N-2);
	}
	
	// Dynamic Programming
	// Top-Down Approach
	public static int countBinaryString_TopDown(int[] dp, int N) {
		
		if(N == 1)
			return 2;
		if(N == 2)
			return 3;
		
		if(dp[N] == 0) {
			dp[N] = countBinaryString_TopDown(dp, N-1) + countBinaryString_TopDown(dp, N-2);
		}
		
		return dp[N];
	}
	
	// Dynamic Programming
	// Bottom-Up Approach
	public static int countBinaryString_BottomUp(int N) {
		
		int[] dp = new int[N+1];
		
		dp[1] = 2;
		dp[2] = 3;
		
		for(int i=3; i<=N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[N];
	}
}
