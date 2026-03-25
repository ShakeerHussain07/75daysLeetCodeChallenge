class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];   
        int mP = 0;         

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
           
            int profit = prices[i] - minPrice;
            if (profit > mP) {
                mP = profit;
            }
        }
        return mP;
    }
}