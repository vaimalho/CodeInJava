/*Party Problem

Given there are N people in a party.

Each person has only 2 options:
	1. To Dance Alone
	2. To Pair Up with any other person
	
Find the number of ways in which N people can dance
*/

package dynamicprogramming;

public class PartyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 3;
		System.out.println(noOfWays(N));
		
		int[] dp = new int[N+1];
		System.out.println(noOfWays_TopDown(dp, N));
		
		System.out.println(noOfWays_BottomUp(N));
		
	}
	
	// Divide & Conquer
	public static int noOfWays(int N) {
		
		if(N==1)
			return 1;
		if(N==2)
			return 2;
		
		return noOfWays(N-1) + (N-1)*noOfWays(N-2);
	}
	
	// Dynamic Programming
	// Top-Down Approach
	public static int noOfWays_TopDown(int[] dp, int N) {
		
		if(N==1)
			return 1;
		if(N==2)
			return 2;
		
		if(dp[N]==0) {
			dp[N] = noOfWays_TopDown(dp, N-1) + (N-1)*noOfWays_TopDown(dp, N-2);
		}
		return dp[N];
	}
	
	// Dynammic Programming
	// Bottom-Up Approach
	public static int noOfWays_BottomUp(int N) {
		
		int[] dp = new int[N+1];
		
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i=3; i<=N; i++) {
			dp[i] = dp[i-1] + (i-1)*dp[i-2];
		}
		return dp[N];
	}

}
