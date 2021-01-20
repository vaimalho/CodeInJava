// House Thief Problem

// There are N houses, each of which has some value
// Thief want to steal the houses, but he can't steal adjacent houses
// What is the Maximum Profit he can steal?

// E.g:
// houseValues = {6,7,1,30,8,2,4}
// Output: 41 --> {7,30,4}

package dynamicprogramming;

public class HouseThiefMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] houseValues = {6,7,1,30,8,2,4};
		System.out.println(maxProfilt(houseValues, 0));
		
		int[] dp = new int[houseValues.length+1];
		System.out.println(maxProfilt(dp, houseValues, 0));
		
		int[] dp2 = new int[houseValues.length+2];
		System.out.println(maxProfilt2(dp2, houseValues, 0));

	}
	
	// Divide and Conquer
	public static int maxProfilt(int[] houseValues, int index) {
		
		if(index >= houseValues.length)
			return 0;
		int stealCurrentHouse = houseValues[index] + maxProfilt(houseValues, index+2);
		int skipCurrentHouse = maxProfilt(houseValues, index+1);
		
		return Math.max(stealCurrentHouse, skipCurrentHouse);
	}
	
	// Dynamic Programming --> Top-Down Approach
	// Time Complexity: O(N)
	public static int maxProfilt(int[] dp, int[] houseValues, int index) {

		if(index >= houseValues.length)
			return 0;
		if(dp[index] == 0) {
			int stealCurrentHouse = houseValues[index] + maxProfilt(dp, houseValues, index+2);
			int skipCurrentHouse = maxProfilt(dp, houseValues, index+1);

			dp[index] =  Math.max(stealCurrentHouse, skipCurrentHouse);
		}
		return dp[index];
	}
	
	// Dynamic Programming --> Bottom-Up Approach
	// Time Complexity: O(N)
	public static int maxProfilt2(int[] dp2, int[] houseValues, int index) {
		dp2[houseValues.length] = 0;
		
		for(int i=houseValues.length-1; i>=0 ; i--) {
			dp2[i] = Math.max(houseValues[i] + dp2[i+2] , dp2[i+1]);
		}
		return dp2[0];
	}

}
