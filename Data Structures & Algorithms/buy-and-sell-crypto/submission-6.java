class Solution {
    public int maxProfit(int[] prices) {
        //review2
        //Solution with 2 pointers
        int l = 0;
        //int r = 1;
        int profit = 0;
        for (int r = 1; r < prices.length; r++) {
            int temp = prices[r] - prices[l];
            if (temp > 0) {
                //r++;
                if (temp > profit) {
                    profit = temp;
                }
            }
            else {
                l = r;
                //r++;
            }
        }

        return profit;
    }
}
