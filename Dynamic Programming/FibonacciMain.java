package dynamicprogramming;

public class FibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(fib(n));
		
		int[] dp = new int[n+1];
		System.out.println(fib_TopDown(dp,n));
		System.out.println(fib_BottomUp(n));

	}
	
	// Divide & Conquer
	// Time Complexity: O(2^n)
	public static int fib(int n) {
		if(n<1)
			return -1;
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	
	// Dynamic Programming
	// Time Complexity: O(n)
	// Top Down

	public static int fib_TopDown(int[] dp, int n) {
		if(n<1)
			return -1;
		if(n<3)
			return n-1;
		if(dp[n]==0) {
			dp[n] = fib_TopDown(dp,n-1) + fib_TopDown(dp,n-2);
		} 
		return dp[n];
	}
		
		
	// Dynamic Programming
	// Time Complexity: O(n)
	// Bottom Up
	
	public static int fib_BottomUp(int n) {
		int[] dp = new int[n+1];
		dp[1] = 0;
		dp[2] = 1;
		
		for(int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}

}
