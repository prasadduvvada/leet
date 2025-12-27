class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int currentprice = prices[0];
        if(prices == null || prices.length < 2){
            return 0;
        }
        else{
            for(int i =0; i<prices.length; i++){
               if(prices[i]<currentprice){
                currentprice = prices[i];
               }
               else{
                int profit = prices[i] - currentprice;
                maxprofit = Math.max(maxprofit,profit);
               }
            }
        }
        return maxprofit;
    }

}