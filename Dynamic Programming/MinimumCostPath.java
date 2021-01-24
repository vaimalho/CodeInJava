/*
Minimum Cost Path

1. We are given a 2D matrix
2. Each cell has a cost associated with it
3. We need to reach End(m-1,n-1) from Start(0,0)
4. We can either go Right or Down

Find the minimum cost path to reach end of a 2D matrix
*/

package dynamicprogramming;

public class MinimumCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
		};
		
		System.out.println(minCostPath(arr, arr.length-1, arr[0].length-1));
		
		int[][] dp = new int[arr.length][arr[0].length];
		System.out.println(minCostPath_TopDown(dp, arr, arr.length-1, arr[0].length-1));
		
		System.out.println(minCostPath_BottomUp(arr, arr.length-1, arr[0].length-1));
	}

	// Divide & Conquer
	public static int minCostPath(int[][] arr, int row, int col) {
		
		if(row < 0 || col < 0)
			return Integer.MAX_VALUE;
		if(row == 0 && col == 0)
			return arr[0][0];
		return arr[row][col] + Math.min(minCostPath(arr, row-1, col),minCostPath(arr, row, col-1));
	}
	
	// Dynamic Programming
	// Top-Down Approach
	public static int minCostPath_TopDown(int[][] dp, int[][] arr, int row, int col) {
		
		if(row < 0 || col < 0)
			return Integer.MAX_VALUE;
		if(row == 0 && col == 0)
			return arr[0][0];
		
		if(dp[row][col] == 0) {
			dp[row][col] = arr[row][col] + Math.min(minCostPath_TopDown(dp, arr, row-1, col), minCostPath_TopDown(dp, arr, row, col-1));
		}
		return dp[row][col];
	}
	
	// Dynamic Programming
	// Bottom-Up Approach
	public static int minCostPath_BottomUp(int[][] arr, int row, int col) {
		
		int[][] dp = new int[row+1][col+1];
		int sum=0;
		
		for(int i=0; i<=row; i++) {
			dp[i][0] = arr[i][0] + sum;
			sum = dp[i][0];
		}
		
		sum=0;
		for(int i=0; i<=col; i++) {
			dp[0][i] = arr[0][i] + sum;
			sum = dp[0][i];
		}
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				dp[i][j] = arr[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[row][col];
	}
}
