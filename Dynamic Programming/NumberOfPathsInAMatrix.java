/*Number of Ways in a Matrix

Given a 2D Matrix with m rows and n columns, Find:
	
	Total Number of Ways to reach End (m-1,n-1) from Start (0,0)
*/
package dynamicprogramming;

public class NumberOfPathsInAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {
				  { 4, 7, 1, 6 }, 
				  { 5, 7, 3, 9 }, 
				  { 3, 2, 1, 2 }, 
				  { 7, 1, 6, 3 } 
		};
		
		System.out.println(noOfPaths(arr.length-1, arr[0].length-1));
		
		int[][] dp = new int[arr.length][arr[0].length];
		System.out.println(noOfPaths_TopDown(dp, arr.length-1, arr[0].length-1));
		
		System.out.println(noOfpaths_BottomUp(arr.length-1, arr[0].length-1));
	}
	
	// Divide & Conquer
	public static int noOfPaths(int row, int col) {
		if(row<0 || col<0)
			return 0;
		if(row==0 && col==0)
			return 1;
		return noOfPaths(row-1, col) + noOfPaths(row, col-1);
	}
	
	// Dynamic Programming
	// Top-Down Approach
	public static int noOfPaths_TopDown(int[][] dp, int row, int col) {
		
		if(row < 0 || col < 0)
			return 0;
		if(row == 0 && col == 0)
			return 1;
		
		if(dp[row][col] == 0) {
			dp[row][col] = noOfPaths_TopDown(dp, row-1, col) + noOfPaths_TopDown(dp, row, col-1);
		}
		return dp[row][col];
	}
	
	// Dynamic Programming
	// Bottom-Up Approach
	public static int noOfpaths_BottomUp(int row, int col) {
		
		int[][] dp = new int[row+1][col+1];
		
		for(int i=0; i<=row ; i++) {
			dp[i][0] = 1;
		}
		
		for(int i=0; i<=col; i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[row][col];
	}
}
