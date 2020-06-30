// Given a Value V and an array of Coins available
// We have indefinite supply of each coin
// Find the minimum number of coins required to make the Value V

public class CoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int output = 70;
		int[] coins = {1,2,5,10,20,50,100,500,1000};
		System.out.println(coinChange(coins,output));
	}
	
	public static int coinChange(int[] coins,int output) {
		int result=0;
		while(output!=0) {
			int coin = selectCoin(coins,output);
			output=output-coin;
			result++;
		}
		return result;
	}
	
	public static int selectCoin(int[] coins,int output) {
		for(int i=coins.length-1;i>=0;i--) {
			if(coins[i]<=output)
				return coins[i];
		}
		return 0;
	}

}
