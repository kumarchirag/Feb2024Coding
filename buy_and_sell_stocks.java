class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buy < prices[i]){
                int profit = prices[i]-buy;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buy = prices[i];
            } 
        }
        return maxProfit;
        
    }
}

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
