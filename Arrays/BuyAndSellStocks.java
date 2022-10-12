/*
Best Time to Buy and Sell Stock
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Example 2:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.
*/

package arrays;

public class BuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit1(prices));
    }

    // Naive Approach
    // TIme Complexity: o(N X N)
    // Space Complexity: O(1)
    public static int maxProfit(int[] prices) {

        int n= prices.length;
        int maxProfit=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                maxProfit = prices[j] - prices[i] > maxProfit ? prices[j] - prices[i] : maxProfit;
            }
        }
        return maxProfit;
    }

    // TIme Complexity: O(N)
    // Space Complexity: O(1)
    public static int maxProfit1(int[] prices) {

        int minProfit = Integer.MAX_VALUE;
        int maxProfilt = 0;

        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < minProfit)
                minProfit = prices[i];
            maxProfilt = prices[i+1] - minProfit > maxProfilt ? prices[i+1] - minProfit : maxProfilt;
        }
        return maxProfilt;
    }
}
