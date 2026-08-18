class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int low = prices[0];
        for(int i = 1; i<n; i++){
            if(prices[i] > low){
                profit = Math.max(profit, Math.abs(prices[i]-low));
            }else{
                low = prices[i];
            }
        }
        return profit;
    }
}
