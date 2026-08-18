class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxProfit=0;
       
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
               int profit =prices[i]-minprice;
               maxProfit = Math.max(maxProfit, profit);
            }
        }
        return  maxProfit;
    }
}