/*
Min Cost to Reach Cell in 2D Array

1. We are given a 2D matrix
2. Each cell has a cost associated with it
3. We need to start from (0,0) and need to reach at (n-1)(n-1) cell
4. We can only go right or down from the current cell

Find the minimum cost to reach (n-1,n-1)th cell
*/
package dynamicprogramming;

public class MinimumCostToReachEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] cost = {
				{1,2,3},{4,8,2},{1,5,3},{6,2,9}
		};
		System.out.println(minCost(cost, cost.length-1, cost[0].length-1));
		
		int[][] dp = new int[cost.length][cost[0].length];
		System.out.println(minCost_TopDown(dp, cost, cost.length-1, cost[0].length-1));
		
		System.out.println(minCost_BottomUp(cost, cost.length-1, cost[0].length-1));
	}
	
	// Divide & Conquer
	public static int minCost(int[][] cost, int row, int col) {
		
		if(row==-1 || col==-1)
			return Integer.MAX_VALUE;
		if(row==0 && col==0) //BASE CASE: If we're at first cell (0, 0),then no need to recurse
			return cost[0][0];
		int r1 = minCost(cost, row-1, col); //Case#1 Get min cost if we go 'up' from current cell
		int r2 = minCost(cost, row, col-1); //Case#2 Get min cost if we go 'down' from current cell
		
		return cost[row][col] + Math.min(r1, r2);
	}
	
	// Dynamic Programming
	// Top Down Approach
	public static int minCost_TopDown(int[][] dp, int[][] cost, int row, int col) {
		
		if(row==-1 || col==-1)
			return Integer.MAX_VALUE;
		if(row==0 && col==0)
			return cost[0][0];
		
		if(dp[row][col]==0) {
			int r1 = minCost_TopDown(dp, cost, row-1, col);
			int r2 = minCost_TopDown(dp, cost, row, col-1);
			
			dp[row][col] = cost[row][col] + Math.min(r1, r2);
		}
		
        return dp[row][col];
	}
	
	// Dynamic Programming
	// Bottom Up Approach
	public static int minCost_BottomUp(int[][] cost, int row, int col) {

		int[][] dp = new int[row+1][col+1];
		int sum=0;
		for(int i=0; i<=col; i++) {
			dp[0][i] = sum + cost[0][i];
			sum = dp[0][i];
		}
		sum=0;
		for(int i=0; i<=row; i++) {
			dp[i][0] = sum + cost[i][0];
			sum = dp[i][0];
		}

		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				dp[i][j] = cost[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[row][col];
	}
		
}
