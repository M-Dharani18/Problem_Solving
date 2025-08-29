class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int least=Integer.MAX_VALUE;
        int c_prof=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<least){
                least=prices[i];
            }
            c_prof=prices[i]-least;
            if(c_prof>max_profit){
                max_profit=c_prof;
            }
        }
        return max_profit;
    }
}