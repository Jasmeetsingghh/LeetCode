class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                maxp=Math.max(maxp,profit);
            }else{
                buy=prices[i];
            }
        }
        return maxp;
    }
}