class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;


        int buyPrice = prices[0];

        int profitValue = 0;

        for(int i = 1; i < n; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }else{
                profitValue = Math.max(profitValue, prices[i] - buyPrice);

            }
        }

        return profitValue;
    }
}