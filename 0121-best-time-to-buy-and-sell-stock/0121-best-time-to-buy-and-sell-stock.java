class Solution {
    public int maxProfit(int[] prices) {
        int buy_pr=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(buy_pr>prices[i]){
                buy_pr=prices[i];
            }
            int ans=prices[i]-buy_pr;
            profit=Math.max(profit,ans);
        }
        return profit;
    }
}