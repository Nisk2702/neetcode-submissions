class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProf = 0;

        for(int i = 1; i<prices.length; i++){
            maxProf = Math.max(maxProf, prices[i] - minPrice);
            minPrice = Math.min(minPrice,prices[i] );
        }

        return maxProf;
    }

}
