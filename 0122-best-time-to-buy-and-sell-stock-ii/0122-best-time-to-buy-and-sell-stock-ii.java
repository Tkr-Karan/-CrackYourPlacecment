class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        
        int buy = prices[0];
        
        int maxProfit = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > buy) maxProfit += prices[i] - buy;
            buy = prices[i];
        }
        
        return maxProfit;
    }
}